package Lambdas;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AccessTest {


Access sm =new Access();
    
    List<Integer> s1= Arrays.asList(3,4,5,6,7,800,900,321);
  List<String> s2=Arrays.asList("aaa","eeeee","ask","aeee","ask","air","lock");
  List<String> s3=Arrays.asList("aaa","asdsa","tttttttt","ssss","amma","tata","lool");
  List<String> s4=Arrays.asList("aaa","asdsa","tttttttt","ssss","amma","lool");
  List<String> s5=Arrays.asList("aaa","ask","ask","air");
  
  
  @Test
  void testAverage() {
    assertEquals(255.75,sm.average(s1),0);
      }

  @Test
  void testCheckLength() {
    assertEquals(s5,sm.checkLength(s2));
}

  @Test
  void testCheckPallindrome() {
    assertEquals(s4,sm.checkPallindrome(s3));
    
  }
}
