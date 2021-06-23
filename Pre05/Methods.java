import java.io.*;
import java.util.*;

public class Methods {

    public static boolean isDivisible(int n, int m){
        if (n%m==0){
          return true;
    }
        else{
          return false;
        }
}
  public boolean isTraingle(int a, int b, int c){
      if (a < (b+c) && b < (a+c) && c <(b+a)){
        return true;
      } else{
        return false;
      }
      }
}