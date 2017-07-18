package com.example.demo.config;

import java.lang.reflect.Method;
import java.security.Provider;


import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
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
public class ReadisConfiguration extends CachingConfigurerSupport{

	@Override
	public KeyGenerator keyGenerator() {
		        return new KeyGenerator(){

					@Override
					public Object generate(Object o, Method method, Object... objects) {
						//格式化缓存key字符串
						StringBuilder sb=new StringBuilder();
						//追加类名
						sb.append(o.getClass().getName());
						//追加方法名
						sb.append(method.getName());
						//遍历参数并且追加
						for (Object obj : objects) {
							sb.append(obj.toString());
						}
						System.out.println("调用Redis缓存Key:"+sb.toString());
						        return sb.toString();  
						    
					}
		        	
		        };  
		    
	}

	/**
	 * 自定义生成key的规则
	    * @param keyGenSpi
	    * @param provider
	    * @param algorithm
	 */

	
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
/*	@Bean
	public CacheManager cacheManager(RedisTemplate redisTemplate){
		return new RedisCacheManager(redisTemplate) ;
		}
*/
}
  
    