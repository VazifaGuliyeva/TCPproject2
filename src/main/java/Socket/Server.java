package Socket;
import java.io.*;
import java.net.*;



public class Server {
    public static void main(String [] args)throws Exception{
        ServerSocket s=new ServerSocket(9999);
        Socket ss=s.accept();
        System.out.println("connected");
        DataInputStream dout=new DataInputStream(ss.getInputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String yoo=dout.readUTF();
            System.out.println("client:"+yoo);
            if(yoo.equalsIgnoreCase("exit"))
                break;
        }
        ss.close();

    }

}
