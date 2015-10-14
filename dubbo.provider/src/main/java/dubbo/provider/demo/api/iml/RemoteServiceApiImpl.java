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

		return String.format("[client info:%s]===>[remote info:%s]", RpcContext
				.getContext().getLocalAddress(), RpcContext.getContext()
				.getRemoteAddress());
	}

	@Override
	public UserDTO getUser() {
		UserDTO dto = new UserDTO();
		dto.setName("I am dubbo");
		return dto;
	}

}
