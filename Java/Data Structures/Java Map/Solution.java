// github.com/punithkumar-bs

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

/* BufferedReader is used instead of Scanner since it's faster and
   won't time out on HackerRank test cases when using Java8 */
class Solution {
    public static void main(String[] args) throws IOException {
        /* Save input as entries in a HashMap */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap();
        while (n-- > 0) {
            String name = br.readLine();
            int phone   = Integer.parseInt(br.readLine());
            map.put(name, phone);
        }
        
        /* Read each query and check if its in our HashMap */
        String s;
        while((s = br.readLine()) != null) {
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        
        br.close();
    }
}
