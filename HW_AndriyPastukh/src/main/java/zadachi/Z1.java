package zadachi;

public class Z1 {
    private String analizeWord(String word){

        if((word.length()==4)&&
                ((!word.contains("\\.")))||
                (!word.contains("\""))||
                (!word.contains(","))||
                (!word.contains("("))||
                (!word.contains(")"))
        )
            StringBuilder stringBuilder = new StringBuilder();

            return stringBuilder.reverse().toString();
    }

    if((word.length()==5)&&(word.contains("\\.")){
        return new StringBuilder(word.replaceAll("\\.", "")).reverse().toString()+".";
    }

     if((word.length()==5)&&(word.contains("\\.")){
        return new StringBuilder(word.replaceAll("\\.", "")).reverse().toString()+",";
    }

    if((word.length()==5)&&
            ((!word.contains("\\.")))||
            (!word.contains("\""))||
            (!word.contains(","))||
            (!word.contains("("))||
            (!word.contains(")"))
            )
    StringBuilder stringBuilder = new StringBuilder();
                    return stringBuilder.reverse().toString();
    }

        return word;
    }
}
