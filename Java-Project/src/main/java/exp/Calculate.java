package exp;

import java.util.ArrayList;
import java.util.Stack;

public class Calculate {

//  public static int calculate(String s) {
//    Stack<Integer> numStack = new Stack<>();
//    Stack<String> operatorStack = new Stack<>();
//    String num = "";
//    boolean flag = false;
//    for (int i = 0; i < s.length(); i++) {
//      char letter = s.charAt(i);
//      if (letter != '+' && letter != '-' && letter != '/' && letter != '*' && !Character
//          .isSpace(letter)) {
//        num += String.valueOf(letter);
//      } else if (!Character.isSpace(letter)) {
//        numStack.push(Integer.parseInt(num));
//        num = "";
//        if (flag) {
//          Integer a = numStack.pop();
//          Integer b = numStack.pop();
//          String operator = operatorStack.pop();
//          switch (operator) {
//            case "+":
//              numStack.push(a + b);
//              break;
//            case "-":
//              numStack.push(b - a);
//              break;
//            case "/":
//              numStack.push(b / a);
//              break;
//            case "*":
//              numStack.push(a * b);
//              break;
//            default:
//              break;
//          }
//          flag = false;
//        }
//        if (letter == '/' || letter == '*') {
//          flag = true;
//        }
//        operatorStack.push(String.valueOf(letter));
//      }
//    }
//    numStack.push(Integer.parseInt(num));
//    if (flag) {
//      Integer a = numStack.pop();
//      Integer b = numStack.pop();
//      String operator = operatorStack.pop();
//      switch (operator) {
//        case "+":
//          numStack.push(a + b);
//          break;
//        case "-":
//          numStack.push(b - a);
//          break;
//        case "/":
//          numStack.push(b / a);
//          break;
//        case "*":
//          numStack.push(a * b);
//          break;
//        default:
//          break;
//      }
//      flag = false;
//    }
//    Integer i = 0;
//    Integer j = 0;
//    Integer sum = numStack.get(0);
//    while (j < operatorStack.size()) {
//      Integer a = numStack.get(i+1);
//      i += 1;
//      String operator = operatorStack.get(j);
//      j += 1;
//      switch (operator) {
//        case "+":
//          sum += a;
//          break;
//        case "-":
//          sum -= a;
//          break;
//        default:
//          break;
//      }
//    }
//    return sum;
//  }


  public static int calculate(String s) {
    Integer sum = 0;
    String lastNum = "";
    String lastOperator = "+";
    s = s + "+";
    for (int i = 0; i < s.length(); i++) {
      char letter = s.charAt(i);
      if (letter != '+' && letter != '-' && letter != '/' && letter != '*' && !Character
          .isAlphabetic(letter)) {
        lastNum += letter;
      } else if (!Character
          .isAlphabetic(letter)) {
        if (letter == '+' || letter == '-') {
          if (lastOperator == "+") {
            sum += Integer.parseInt(lastNum);
          } else if (lastOperator == "-") {
            sum -= Integer.parseInt(lastNum);
          }
          lastNum = "";
          lastOperator = String.valueOf(letter);
        } else {
          String nextNum = "";
          i += 1;
          while (i < s.length()) {
            char alphabet = s.charAt(i);
            if (alphabet != '+' && alphabet != '-' && alphabet != '/' && alphabet != '*'
                && !Character
                .isAlphabetic(alphabet)) {
              nextNum += alphabet;
            } else if (!Character
                .isAlphabetic(alphabet)) {
              if (alphabet == '+' || alphabet == '-') {
                Integer result = 0;
                if (letter == '*') {
                  result = Integer.parseInt(lastNum) * Integer.parseInt(nextNum);
                } else if (letter == '/') {
                  result = Integer.parseInt(lastNum) / Integer.parseInt(nextNum);
                }
                if (lastOperator == "+") {
                  sum += result;
                } else if (lastOperator == "-") {
                  sum += result;
                }
                lastOperator = String.valueOf(alphabet);
                lastNum = "";
              } else {
                if (alphabet == '*') {
                  lastNum = ("" + Integer.parseInt(lastNum) * Integer.parseInt(nextNum));
                } else {
                  lastNum = ("" + Integer.parseInt(lastNum) / Integer.parseInt(nextNum));
                }
                nextNum = "";
              }
            }
            i+=1;
          }
        }
      }
    }
    return sum;
  }

  public static void main(String[] args) {
//    String s = "123";
//    s += 's';
//    System.out.println(new Integer(12).toString());
//    Stack<Integer> stack = new Stack<>();
//    stack.push(3);
//    stack.push(4);
//    stack.add(0, 5);
//    System.out.println(stack.get(0));
//    System.out.println(stack.toString());
    System.out.println(calculate("1+1"));
    String s = "x";
    String s1 = "x";
    System.out.println(s==s1);
//    System.out.println(Character.isSpace(" 3/2".charAt(0)));
//    System.out.println(Integer.parseInt("12"));
  }
}

// 本题需要再优化
