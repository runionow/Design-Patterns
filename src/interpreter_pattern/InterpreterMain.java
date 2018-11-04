package interpreter_pattern;

import java.beans.Expression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Interpreter Pattern
 *
 * 1. represents Grammar
 * 2. Interpret a Sentence
 * 3. Map a domain
 * 4. Abstract Syntax tree
 *
 * Ex:
 * 1. java.util.pattern
 * 2. java.text.pattern
 *
 * Design Consideration
 * 1. Abstract Expression
 * 2. Interpret
 * 3. Terminal Expression
 * 4. Nonterminal Expression
 *
 * Pieces of UML Diagram
 * 1. Context: Global to the interpreter.
 * 2. Abstract Expression:
 * 3. Terminal Expression
 * 4. Non Terminal Expression
 * 5. Client
 */
public class InterpreterMain {

    static Expression buildInterpreterTree(){
        Expression terminal1 = null;
        return terminal1;
    }
    public static void main(String[] args){
        // [START] Example 1
        String input = "Lions ,and tigers ,and bears! Oh my !";
        Pattern p  = Pattern.compile("(lion|cat|dog|beef|human|tiger|lion)");


        Matcher m = p.matcher(input);

        while(m.find()) {
            System.out.println("Found a "+ m.group());
        }
        // [END] of Example 1

        // [START]-Example2
        String context ="Lions";
        Expression define = buildInterpreterTree();



    }
}
