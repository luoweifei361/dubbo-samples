package dubbo.api.demo.api;

import dubbo.api.demo.dto.UserDTO;

public interface RemoteServiceApi {

	String getRpcInfo();

	UserDTO getUser();

}
