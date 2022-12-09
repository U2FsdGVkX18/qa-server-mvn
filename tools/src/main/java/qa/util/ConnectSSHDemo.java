package qa.util;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

import java.io.IOException;
import java.io.InputStream;

public class ConnectSSHDemo {
    public static void main(String[] args) throws JSchException, IOException {

        JSch jsch = new JSch();
        Session session = jsch.getSession("root", "183.136.238.102", 26266);
        session.setPassword("%1dSFYMx{(+eOXDa");
        session.setConfig("StrictHostKeyChecking", "no");
        session.connect(30000);
        boolean connected = session.isConnected();
        System.out.println(connected);

        ChannelExec channel = (ChannelExec) session.openChannel("exec");
        channel.setCommand("nvidia-smi --query-gpu=timestamp,memory.total,memory.free,memory.used --format=csv,noheader,nounits");
        channel.connect();
        InputStream inputStream = channel.getInputStream();
        System.out.println(inputStream);

        byte[] bytes = new byte[1024];
        StringBuffer sf = new StringBuffer();
        int i;
        while ((i = inputStream.read()) != -1) {
            sf.append((char) i);
        }
        System.out.println(sf);

    }
}
