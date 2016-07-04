package dubbo.provider.demo.api.iml;

import com.alibaba.dubbo.rpc.RpcContext;

import dubbo.api.demo.api.RemoteServiceApi;
import dubbo.api.demo.dto.UserDTO;

/**
 * 
 * @author luoweifei
 *
 */
public class RemoteServiceApiImpl implements RemoteServiceApi {

	@Override
	public String getRpcInfo() {

		return String.format("[服务消费者 info:%s]===>[服务提供者 info:%s]",RpcContext.getContext()
				.getRemoteAddress(), RpcContext.getContext().getLocalAddress());
	}

	@Override
	public UserDTO getUser() {
		UserDTO dto = new UserDTO();
		dto.setName("I am dubbo");
		return dto;
	}

}
