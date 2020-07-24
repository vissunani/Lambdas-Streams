package Lambdas;

import java.util.List;
import java.util.stream.Collectors;

public class Access {

public double average(List<Integer> a)
{
  
  return a.stream()
      .mapToInt(val -> val).average().orElse(0.0);
}
public List<String> checkLength(List <String> a)
{
  return a.stream()
  .filter(value -> ((value.length()==3) && (value.charAt(0)=='a') ))
  .collect(Collectors.toList());
     
  
  
}
public List<String> checkPallindrome(List <String> a)
{
  return a.stream()
    .filter(value -> check(value))  
    .collect(Collectors.toList());
     
  
  
}

private static boolean  check(String value) {

  
  String sk="";
  for(int i1=value.length()-1;i1>=0;i1--)
  {
    sk=sk+value.charAt(i1);
  }
  if(value.equals(sk))
  {
  return(true);
  }
  else {
    return(false);
  }
}
}