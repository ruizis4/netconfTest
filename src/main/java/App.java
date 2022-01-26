//arista router parameters: host="ceos1", port="830", timeout=30, username="admin", password="xxxx", hostkey_verify=False

import com.cisco.stbarth.netconf.anc.NetconfClient;
import com.cisco.stbarth.netconf.anc.NetconfException;
import com.cisco.stbarth.netconf.anc.NetconfSSHClient;
import com.cisco.stbarth.netconf.anc.NetconfSession;
public class App {
    public static void main(String[] args) {
        NetconfSSHClient testClient= new NetconfSSHClient("localhost",830, "admin");
        testClient.setPassword("xxxx");
        testClient.setStrictHostKeyChecking(false);
        testClient.setTimeout(3600000);
        testClient.setKeepalive(15000);

        try {
            testClient.createSession().hello();
            testClient.close();
        } catch (NetconfException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }
}
