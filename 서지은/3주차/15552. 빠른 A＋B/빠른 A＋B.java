import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        
        //이렇게 stringtokenizer를 상단 부에 정의해주고 시작
        StringTokenizer st;
        
        for (int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine(), " ");
            
            bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+ "\n");
        }
        
        br.close();
        
        bw.flush();
        bw.close();
    }
}