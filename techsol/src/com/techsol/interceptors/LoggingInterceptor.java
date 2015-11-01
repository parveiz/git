package com.techsol.interceptors;

import java.io.Serializable;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.jboss.logging.Logger;

@Interceptor
@Log
public class LoggingInterceptor implements Serializable {

	private static final long serialVersionUID = 1236094559584334686L;

	private static final Logger logger = Logger
			.getLogger(LoggingInterceptor.class);

	@AroundInvoke
	public Object logMethodEntry(InvocationContext ctx) throws Exception {
		Object result = null;
		try {
			logger.info("Before entering method:" + ctx.getMethod().getName());
			result = ctx.proceed();
		} catch (Exception e) {
			logger.error("Exception occured while executing method - "
					+ ctx.getMethod().getName());
			logger.error("", e);
		} finally {
			logger.info("After exiting method:" + ctx.getMethod().getName());

		}
		return result;
	}
}