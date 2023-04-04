package com.example.demo.udms.test.Repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.udms.test.Domain.SelectTestDomain;
import com.example.demo.udms.test.Domain.TestDomain;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface SelectTestRepository extends ReactiveCrudRepository<SelectTestDomain, String>{
	
	@Query("""
			select 
		   		tad.div2 as id, 
		   		tad.ri as "name", 
		   		avg(tad.pop) as value, 
		   		sum(tgfp.flo_pop) as floPop
			from tb_admin_div tad
			left join tb_grid_floating_population tgfp on concat(tad.div1,' ', tad.div2) = concat(tgfp.div1,' ', tgfp.div2)
			where tgfp.col_time = (select max(col_time)
			from tb_grid_floating_population tgfp)
			group by tad.div1, tad.div2, tad.eup, tad.ri;
			""")
//	@Query("""
//			select  
//		   		tad.ri as "name", 
//		   		tad.pop as value
//			from tb_admin_div tad
//			limit 10;
//			""")	
	Flux<SelectTestDomain> findLiByColTime();
	
//	@Query("""
//			select to_char(col_time, 'yyyy-mm-dd HH24:MI:SS') as colTime
//			from tb_grid_floating_population tgfp
//			group by col_time
//			order by col_time desc
//			limit 1;
//			""")
//	Mono<String> findColTimeLast();
}
