import samminhch.net.Web;
import samminhch.utils.ArrayUtils;
import samminhch.utils.HashGraph;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)throws IOException {
        HashGraph<Integer> graph = new HashGraph<>();
        graph.add(1);
        graph.add(2);
        graph.add(3);
        graph.connect(1, 2);
        graph.biConnect(2, 3);
        System.out.println(graph.toString());
        
    }
}