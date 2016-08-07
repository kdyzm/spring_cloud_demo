package my.springboot.demo;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

public class HttpCommand extends HystrixCommand<People> {

	protected HttpCommand(String url) {
		super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("com.kdyzm.demo")));
	}

	@Override
	protected People run() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
