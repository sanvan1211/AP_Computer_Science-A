import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StringTest extends JFrame
        implements ActionListener
{
  private JTextField input, result;

  public StringTest()
  {
    super("String test");
    Box box1 = Box.createVerticalBox();
    box1.add(Box.createVerticalStrut(20));
    box1.add(new JLabel("Input:"));
    box1.add(Box.createVerticalStrut(20));
    box1.add(new JLabel("Result:"));

    input = new JTextField(20);
    input.setBackground(Color.YELLOW);
    input.addActionListener(this);
    input.selectAll();

    result = new JTextField(20);
    result.setBackground(Color.WHITE);
    result.setEditable(false);

    Box box2 = Box.createVerticalBox();
    box1.add(Box.createVerticalStrut(20));
    box2.add(input);
    box2.add(Box.createVerticalStrut(20));
    box2.add(result);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(box1);
    c.add(box2);
    input.requestFocus();
  }
  
  public void actionPerformed(ActionEvent e)
  {
    String str = input.getText();

    // ... insert code to process str or call a method here
    // Test one at a time: uncomment the one you want to try
    //str = removeDashes(str);     // part (a): 987-65-4321
    //str = changeFormat(str);     // part (b): 05/31/2019
    str = leadingZeros(str);       // part (c): 5/3/2022

    result.setText(str);
    input.selectAll();
  }

  public static void main(String[] args)
  {
    StringTest window = new StringTest();
    window.setBounds(100, 100, 360, 160);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }

  //PUT YOUR METHODS HERE 
  //TEST THEM ONE AT A TIME!
  
  //eg public String removeDashes(String ssn)

  // (a) "ddd-dd-dddd" -> "ddddddddd"
  public String removeDashes(String ssn)
  {
    // the dashes are at index 3 and index 6
    return ssn.substring(0, 3) + ssn.substring(4, 6) + ssn.substring(7);
  }

  // (b) "mm/dd/yyyy" -> "dd-mm-yyyy"
  public String changeFormat(String dateStr)
  {
    String mm = dateStr.substring(0, 2);
    String dd = dateStr.substring(3, 5);
    String yyyy = dateStr.substring(6);
    return dd + "-" + mm + "-" + yyyy;
  }

  // (c) "m/d/yyyy" (with or without leading zeros) -> "dd-mm-yyyy"
  public String leadingZeros(String dateStr)
  {
    int firstSlash = dateStr.indexOf("/");
    String mm = dateStr.substring(0, firstSlash);
    String rest = dateStr.substring(firstSlash + 1);

    int secondSlash = rest.indexOf("/");
    String dd = rest.substring(0, secondSlash);
    String yyyy = rest.substring(secondSlash + 1);

    if (mm.length() == 1)
    {
      mm = "0" + mm;
    }
    if (dd.length() == 1)
    {
      dd = "0" + dd;
    }
    return dd + "-" + mm + "-" + yyyy;
  }

  
}

/*
 *  Pseudocode:
 *    removeDashes(ssn):
 *        return ssn[0..3) + ssn[4..6) + ssn[7..end)
 *
 *    changeFormat(date):
 *        mm   <- date[0..2)
 *        dd   <- date[3..5)
 *        yyyy <- date[6..end)
 *        return dd + "-" + mm + "-" + yyyy
 *
 *    leadingZeros(date):
 *        s1   <- index of first "/" in date
 *        mm   <- date[0..s1)
 *        rest <- date[s1+1..end)
 *        s2   <- index of first "/" in rest
 *        dd   <- rest[0..s2)
 *        yyyy <- rest[s2+1..end)
 *        if length(mm) == 1 then mm <- "0" + mm
 *        if length(dd) == 1 then dd <- "0" + dd
 *        return dd + "-" + mm + "-" + yyyy
 *
 *  Reference(s):
 *    - AP Computer Science A Java Quick Reference (String methods)
 *    - Oracle Java SE API docs: java.lang.String
 *    - Claude (Anthropic AI assistant) helped with the code and with
 *      drafting this report
 *    - Sennrich, Haddow & Birch (2016), "Neural Machine Translation of
 *      Rare Words with Subword Units" (Byte-Pair Encoding)
 *    - Kudo & Richardson (2018), "SentencePiece"
 *

 *    I tested each method one at a time, as the starter file says to,
 *    by uncommenting a single call in actionPerformed() and typing
 *    inputs into the GUI. I also called the methods directly from a
 *    small test class to check exact outputs:
 *
 *      Method          Input           Expected      Actual   Pass?
 *      removeDashes    987-65-4321     987654321     same     yes
 *      removeDashes    123-45-6789     123456789     same     yes
 *      changeFormat    05/31/2019      31-05-2019    same     yes
 *      changeFormat    12/25/2023      25-12-2023    same     yes
 *      leadingZeros    5/3/2022        03-05-2022    same     yes
 *      leadingZeros    11/7/2020       07-11-2020    same     yes
 *      leadingZeros    4/15/2021       15-04-2021    same     yes
 *      leadingZeros    05/31/2019      31-05-2019    same     yes
 *
 *    The leadingZeros cases cover all four possibilities: 1-digit
 *    month and 1-digit day, 2-digit month and 1-digit day, 1-digit
 *    month and 2-digit day, and both already padded (output should
 *    not change except for the reordering).
 *    Known limitation: the methods assume the input is well formed.
 *    Input like "abc" would throw a StringIndexOutOfBoundsException.
 *    The lab did not ask for validation, but a production version
 *    would check the format first.
 *
REFLECTION: 
The biggest thing I learned in this lab was the difference between fixed-width parsing and delimiter-based parsing. Parts (a) and (b) were easy once I wrote down the index of each character, because the dashes and slashes are always in the same place. Part (c) was harder: my first idea of reusing the fixed indexes broke as soon as the month had only one digit. That made me switch to indexOf(), which finds the slashes at run time, and it made me pay close attention to substring()'s half-open range [begin, end), which is why the "+1" after each slash matters.

This lab also connected to how large language models handle text. Before a model sees anything, the text is normalized: Unicode forms are standardized (NFC/NFKC), whitespace is cleaned up, and dates, numbers, and IDs are often put into one format, which is exactly what leadingZeros() does. The text is then tokenized into integer IDs by a subword tokenizer such as Byte-Pair Encoding, which repeatedly merges the most frequent pairs of bytes or characters into vocabulary entries. Because of this, "5/3/2022" and "05/03/2022" can turn into completely different token sequences, and numbers often get split in irregular chunks, which is why many newer tokenizers split digits individually. Part (a) also matches real PII redaction, where pipelines detect patterns like "ddd-dd-dddd" and mask them beforethe text is used for training.

Overall, I liked that the lab tied basic AP String methods to real AI systems instead of feeling like isolated practice. The main weakness of my code is that it assumes well-formed input, so something like "abc" would throw a StringIndexOutOfBoundsException. One suggestion for the lab would be an optional part (d) that validates input or handles other formats like "yyyy-mm-dd" or month names, which would be closer to the messy text real preprocessing pipelines have to deal with.
*/
