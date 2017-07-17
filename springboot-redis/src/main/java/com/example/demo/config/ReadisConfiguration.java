package com.example.demo.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;

/**
 *   
  * @classDesc: 功能描述:(采用redisManager作为缓存管理器)
  * @author: 周聪  
  * @createTime: 2017年7月17日 下午11:02:06  
  * @version: v1.0  
  * @copyright:zcong
 */
@Configuration
@EnableCaching//注解来开启我们的项目支持缓存，我们在配置类内添加了方
public class ReadisConfiguration {
	
	/**
	 * 
		* @methodDesc: 功能描述:(我们在配置类内添加了方法cacheManager()，方法的返回值则是使用了我们的Redis缓存的管理)
	    * @author: 周聪  
		* @param: @param redisTemplate
		* @param: @return   
	    * @createTime:2017年7月17日 下午11:06:55
	    * @returnType:@param redisTemplate
	    * @returnType:@return CacheManager  
		* @copyright:zong
	 */
	@Bean
	public CacheManager cacheManager(RedisTemplate redisTemplate){
		return new RedisCacheManager(redisTemplate) ;
		}

}
  
    