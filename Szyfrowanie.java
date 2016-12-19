package szyfrowanie;

public class Szyfrowanie {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String text = "TAJNEHASLO";
        int offset = -53;
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (!text.matches("^[A-Z]*$")){
            System.err.println("Znaki spoza alfabetu");
        }
        
        for (int i=0;i<text.length();i++){
            int ch = text.charAt(i);
            int pos = alpha.indexOf(ch);
            pos = (pos+offset);
            if(pos<0)
            {
                pos=pos%alpha.length();
                pos=(alpha.length()+pos)%alpha.length();
            }
            ch=alpha.charAt(pos);
           sb.append((char)(ch));
        }
        System.out.println(sb);         }}
        //regex101.com
        //[a-zA-Z0-9]{3,}+\w+$  
       