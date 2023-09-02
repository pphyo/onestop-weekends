package com.jdc.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Proxy Class call MI Router
 * @author pphyo
 *
 */

public class MIRouter implements Internet {

	private MargaRouter marga;
	private static List<String> bannedSite;
	
	static {
		bannedSite = new ArrayList<>();
		bannedSite.add("mal.com");
		bannedSite.add("kkk.com");
		bannedSite.add("htainwin.com");
	}
	
	public MIRouter() {
		marga = new MargaRouter();
	}
	
	@Override
	public void connect(String host) {
		
//		for(String site : bannedSite) {
//			if(site.equals(host.toLowerCase()))
//				throw new RuntimeException("Access Denied");
//		}
		
		if(bannedSite.contains(host.toLowerCase()))
			throw new RuntimeException("Access Denied");
		
		marga.connect(host);
		
	}
	
}
