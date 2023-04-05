
package familysearchtree;

import java.util.*;

public class FamilySearch {

    public static void FamilyToFind() {
       Scanner family = new Scanner(System.in);
        System.out.print("Give the first name: ");
        String first = family.nextLine();
        System.out.print("Give the second name: ");
        String second = family.nextLine();
        
        System.out.println("\n\n Family Realationship.");
	System.out.println("<==============================>");
        System.out.println();
        
        Boolean result = false;
        
        String parents = Parents(first,second);
        String couple = Couple(first,second);
        String children = Children(first,second);
        String grandparents = Grandparents(first,second);
        String unclueandAunt = UncleandAunt(first,second);
        String cousins = Cousins(first,second);
        String siblings = Siblings(first,second);
        String grandchildren = Grandchildren(first,second);
        String nephewAndNiece = NephewAndNiece(first,second);
        String noRelation = NoRelation(first,second);
        
        while(!result){
            if(parents != ""){
                System.out.print(first + " to " + second + " is: "+ parents);
                result = true;
            }
            else if(couple != ""){
                System.out.print(first + " to " + second + " is: "+ couple);
                result = true;
            }
            else if(children != ""){
                System.out.print(first + " to " + second + " is: "+ children);
                result = true;
            }
            else if(grandparents != ""){
                System.out.print(first + " to " + second + " is: "+ grandparents);
                result = true;
            }
            else if(unclueandAunt != ""){
                System.out.print(first + " to " + second + " is: "+ unclueandAunt);
                result = true;
            }
            else if(cousins != ""){
                System.out.print(first + " to " + second + " is: "+ cousins);
                result = true;
            }
            else if(siblings != ""){
                System.out.print(first + " to " + second + " is: "+ siblings);
                result = true;
            }
            else if(grandchildren != ""){
                System.out.print(first + " to " + second + " is: "+ grandchildren);
                result = true;
            }
            else if(nephewAndNiece != ""){
                System.out.print(first + " to " + second + " is: "+ nephewAndNiece);
                result = true;
            }
            else {
                System.out.print(noRelation);
                result = true;
            }
            
            
        }
        
        System.out.println();
        System.out.println();

           
    }
    
    public static String Parents(String f,String s){
        
        String first = f;
        String second = s;
        String ret = "";
        
        if("Steffon Baratheon".equals(first) && "Robert Baratheon".equals(second)){
            ret = "Father";
        }
        if("Steffon Baratheon".equals(first) && "Stannis Baratheon".equals(second)){
            ret = "Father";
        }
        if("Steffon Baratheon".equals(first) && "Renly Baratheon".equals(second)){
            ret = "Father";
        }
        if("Cassana Estermont".equals(first) && "Robert Baratheon".equals(second)){
            ret = "Mother";
        }
        if("Cassana Estermont".equals(first) && "Stannis Baratheon".equals(second)){
            ret = "Mother";
        }
        if("Cassana Estermont".equals(first) && "Renly Baratheon".equals(second)){
            ret = "Mother";
        }
        if("Robert Baratheon".equals(first) && "Gendry".equals(second)){
            ret = "Father";
        }
        if("Robert Baratheon".equals(first) && "Joffrey Baratheon".equals(second)){
            ret = "Father";
        }
        if("Robert Baratheon".equals(first) && "Myrcella Baratheon".equals(second)){
            ret = "Father";
        }
        if("Robert Baratheon".equals(first) && "Tommen Baratheon".equals(second)){
            ret = "Father";
        }
        if("Cersei Lannister".equals(first) && "Gendry".equals(second)){
            ret = "Mother";
        }
        if("Cersei Lannister".equals(first) && "Joffrey Baratheon".equals(second)){
            ret = "Mother";
        }
        if("Cersei Lannister".equals(first) && "Myrcella Baratheon".equals(second)){
            ret = "Mother";
        }
        if("Cersei Lannister".equals(first) && "Tommen Baratheon".equals(second)){
            ret = "Mother";
        }
        
        return ret;

    }
    
    public static String Couple(String f,String s){
        String first = f;
        String second = s;
        String ret = "";
           
        if("Steffon Baratheon".equals(first) && "Cassana Estermont".equals(second)){
            ret = "Husband";
        }
        if("Cassana Estermont".equals(first) && "Steffon Baratheon".equals(second)){
            ret = "Wife";
        }
        if("Robert Baratheon".equals(first) && "Cersei Lannister".equals(second)){
            ret = "Husband";
        }
        if("Cercei Lannister".equals(first) && "Robert Baratheon".equals(second)){
            ret = "Wife";
        }
        if("Stannis Baratheon".equals(first) && "Selyse Baratheon".equals(second)){
            ret = "Husband";
        }
        if("Selyse Baratheon".equals(first) && "Stannis Baratheon".equals(second)){
            ret = "Wife";
        }
        if("Renly Baratheon".equals(first) && "Margaery Tyrell".equals(second)){
            ret = "Husband";
        }
        if("Margaery Tyrell".equals(first) && "Renly Baratheon".equals(second)){
            ret = "Wife";
        }
        
        return ret;
        
    }
    
    public static String Children(String f,String s) {
         String first = f;
         String second = s;
         String ret = "";

         if("Robert Baratheon".equals(first) && "Steffon Baratheon".equals(second)){
             ret = "Son";
         }
         if("Robert Baratheon".equals(first) && "Cassana Estermont".equals(second)){
             ret = "Son";
         }
         if("Stannis Baratheon".equals(first) && "Steffon Baratheon".equals(second)){
             ret = "Son";
         }
         if("Stannis Baratheon".equals(first) && "Cassana Estermont".equals(second)){
             ret = "Son";
         }
         if("Renly Baratheon".equals(first) && "Steffon Baratheon".equals(second)){
             ret = "Son";
         }
         if("Renly Baratheon".equals(first) && "Cassana Estermont".equals(second)){
             ret = "Son";
         }
         if("Gendry".equals(first) && "Robert Baratheon".equals(second)){
             ret = "Son";
         }
         if("Joffrey Baratheon".equals(first) && "Robert Baratheon".equals(second)){
             ret = "Son";
         }
         if("Myrcella Baratheon".equals(first) && "Robert Baratheon".equals(second)){
             ret = "Daughter";
         }
         if("Tommen Baratheon".equals(first) && "Robert Baratheon".equals(second)){
             ret = "Son";
         }
         if("Joffrey Baratheon".equals(first) && "Cersei Lannister".equals(second)){
             ret = "Son";
         }
         if("Myrcella Baratheon".equals(first) && "Cersei Lannister".equals(second)){
             ret = "Daughter";
         }
         if("Tommen Baratheon".equals(first) && "Cersei Lannister".equals(second)){
             ret = "Son";
         }
         if("Shireen Baratheon".equals(first) && "Stannis Baratheon".equals(second)){
             ret = "Son";
         }
         if("Shireen Baratheon".equals(first) && "Selyse Baratheon".equals(second)){
             ret = "Son";
         }    
         return ret;
     } 
   
    public static String Grandparents(String f,String s){
         String first = f;
         String second = s;
         String ret = "";

         if("Steffon Baratheon".equals(first) && "Gendry".equals(second)){
             ret = "Grandfather";
         }
         if("Steffon Baratheon".equals(first) && "Joffrey Baratheon".equals(second)){
             ret = "Grandfather";
         }
         if("Steffon Baratheon".equals(first) && "Myrcella Baratheon".equals(second)){
             ret = "Grandfather";
         }
         if("Steffon Baratheon".equals(first) && "Tommen Baratheon".equals(second)){
             ret = "Grandfather";
         }
         if("Steffon Baratheon".equals(first) && "Shireen Baratheon".equals(second)){
             ret = "Grandfather";
         } 
         if("Cassana Estermont".equals(first) && "Gendry".equals(second)){
             ret = "Grandmother";
         }
         if("Cassana Estermont".equals(first) && "Joffrey Baratheon".equals(second)){
             ret = "Grandmother";
         }
         if("Cassana Estermont".equals(first) && "Myrcella Baratheon".equals(second)){
             ret = "Grandmother";
         }
         if("Cassana Estermont".equals(first) && "Tommen Baratheon".equals(second)){
             ret = "Grandmother";
         }
         if("Cassana Estermont".equals(first) && "Shireen Baratheon".equals(second)){
             ret = "Grandmother";
         }
         return ret;

    }
    
    public static String UncleandAunt(String f,String s){
             String first = f;
             String second = s;
             String ret = "";

             if("Robbert Baratheon".equals(first) && "Shireen Baratheon".equals(second)){
             ret = "Uncle";
             }   
             if("Cersei Lannister".equals(first) && "Shireen Baratheon".equals(second)){
             ret = "Aunt";
             }
             if("Renly Baratheon".equals(first) && "Shireen Baratheon".equals(second)){
             ret = "Uncle";
             }   
             if("Magaery Tyrell".equals(first) && "Shireen Baratheon".equals(second)){
             ret = "Aunt";
             }   
             if("Stannis Baratheon".equals(first) && "Gendry".equals(second)){
             ret = "Uncle";
             }
             if("Stannis Baratheon".equals(first) && "Joffrey Baratheon".equals(second)){
             ret = "Uncle";
             }
             if("Stannis Baratheon".equals(first) && "Myrcella Baratheon".equals(second)){
             ret = "Uncle";
             }
             if("Stannis Baratheon".equals(first) && "Tommen Baratheon".equals(second)){
             ret = "Uncle";
             }
             if("Selyse Baratheon".equals(first) && "Gendry".equals(second)){
             ret = "Aunt";
             }
             if("Selyse Baratheon".equals(first) && "Joffrey Baratheon".equals(second)){
             ret = "Aunt";
             }
             if("Selyse Baratheon".equals(first) && "Myrcella Baratheon".equals(second)){
             ret = "Aunt";
             }
             if("Selyse Baratheon".equals(first) && "Tommen Baratheon".equals(second)){
             ret = "Aunt";
             }
              if("Renly Baratheon".equals(first) && "Gendry".equals(second)){
             ret = "Uncle";
             }
             if("Renly Baratheon".equals(first) && "Joffrey Baratheon".equals(second)){
             ret = "Uncle";
             }
             if("Renly Baratheon".equals(first) && "Myrcella Baratheon".equals(second)){
             ret = "Uncle";
             }
             if("Renly Baratheon".equals(first) && "Tommen Baratheon".equals(second)){
             ret = "Uncle";
             }
             if("Magaery Tyrell".equals(first) && "Gendry".equals(second)){
             ret = "Aunt";
             }
             if("Magaery Tyrell".equals(first) && "Joffrey Baratheon".equals(second)){
             ret = "Aunt";
             }
             if("Magaery Tyrell".equals(first) && "Myrcella Baratheon".equals(second)){
             ret = "Aunt";
             }
             if("Magaery Tyrell".equals(first) && "Tommen Baratheon".equals(second)){
             ret = "Aunt";
             }
             return ret;

    }

    public static String Cousins(String f,String s){
             String first = f;
             String second = s;
             String ret = "";

             if("Gendry".equals(first) && "Joffrey Baratheon".equals(second)){
             ret = "Cousins";
             }
             if("Gendry".equals(first) && "Myrcella Baratheon".equals(second)){
             ret = "Cousins";
             }
             if("Gendry".equals(first) && "Tommen Baratheon".equals(second)){
             ret = "Cousins";
             }
             if("Gendry".equals(first) && "Shireen Baratheon".equals(second)){
             ret = "Cousins";
             }
             if("Shireen Baratheon".equals(first) && "Gendry".equals(second)){
             ret = "Cousins";
             }
             if("Shireen Baratheon".equals(first) && "Myrcella Baratheon".equals(second)){
             ret = "Cousins";
             }
             if("Shireen Baratheon".equals(first) && "Tommen Baratheon".equals(second)){
             ret = "Cousins";
             }
             if("Shireen Baratheon".equals(first) && "Joffrey Baratheon".equals(second)){
             ret = "Cousins";
             }    
             return ret;

    }

    public static String Siblings(String f,String s){

             String first = f;
             String second = s;
             String ret = "";


             if("Joffrey Baratheon".equals(first) && "Myrcella Baratheon".equals(second)){
             ret = "Brother";
             }
             if("Joffrey Baratheon".equals(first) && "Tommen Baratheon".equals(second)){
             ret = "Brother";
             }
             if("Myrcella Baratheon".equals(first) && "Joffrey Baratheon".equals(second)){
             ret = "Sister";
             }
             if("Myrcella Baratheon".equals(first) && "Tommen Baratheon".equals(second)){
             ret = "Sister";
             }
             if("Tommen Baratheon".equals(first) && "Joffrey Baratheon".equals(second)){
             ret = "Brother";
             }
             if("Tommen Baratheon".equals(first) && "Myrcella Baratheon".equals(second)){
             ret = "Brother";
             }
             if("Robert Baratheon".equals(first) && "Stannis Baratheon".equals(second)){
             ret = "Brother";
             }
             if("Robert Baratheon".equals(first) && "Renly Baratheon".equals(second)){
             ret = "Brother";
             }
             if("Stannis Baratheon".equals(first) && "Robert Baratheon".equals(second)){
             ret = "Brother";
             }
             if("Stannis Baratheon".equals(first) && "Renly Baratheon".equals(second)){
             ret = "Brother";
             }
             if("Renly Baratheon".equals(first) && "Robert Baratheon".equals(second)){
             ret = "Brother";
             }
             if("Renly Baratheon".equals(first) && "Stannis Baratheon".equals(second)){
             ret = "Brother";
             }
             return ret;


    }

    public static String Grandchildren(String f,String s){

             String first = f;
             String second = s;
             String ret = "";


             if("Joffrey Baratheon".equals(first) && "Steffon Baratheon".equals(second)){
             ret = "Grandson";
             }
             if("Gendry".equals(first) && "Steffon Baratheon".equals(second)){
             ret = "Grandson";
             }
             if("Myrcella Baratheon".equals(first) && "Steffon Baratheon".equals(second)){
             ret = "Granddaughter";
             }
             if("Tommen Baratheon".equals(first) && "Steffon Baratheon".equals(second)){
             ret = "Grandson";
             }
             if("Shireen Baratheon".equals(first) && "Steffon Baratheon".equals(second)){
             ret = "Grandson";
             }       
             if("Joffrey Baratheon".equals(first) && "Cassana Estermont".equals(second)){
             ret = "Grandson";
             }
             if("Gendry".equals(first) && "Cassana Estermont".equals(second)){
             ret = "Grandson";
             }
             if("Myrcella Baratheon".equals(first) && "Cassana Estermont".equals(second)){
             ret = "Granddaughter";
             }
             if("Tommen Baratheon".equals(first) && "Cassana Estermont".equals(second)){
             ret = "Grandson";
             }
             if("Shireen Baratheon".equals(first) && "Cassana Estermont".equals(second)){
             ret = "Grandson";
             }
             return ret;

    }

    public static String NephewAndNiece(String f,String s){
             String first = f;
             String second = s;
             String ret = "";

             if("Shireen Baratheon".equals(first) && "Robert Baratheon".equals(second)){
             ret = "Nephew";
             }
             if("Shireen Baratheon".equals(first) && "Cersei Lannister".equals(second)){
             ret = "Nephew";
             }
             if("Joffrey Baratheon".equals(first) && "Stannis Baratheon".equals(second)){
             ret = "Nephew";
             }
             if("Gendry".equals(first) && "Stannis Baratheon".equals(second)){
             ret = "Nephew";
             }
             if("Myrcella Baratheon".equals(first) && "Stannis Baratheon".equals(second)){
             ret = "Niece";
             }
             if("Tommen Baratheon".equals(first) && "Stannis Baratheon".equals(second)){
             ret = "Nephew";
             }
             if("Joffrey Baratheon".equals(first) && "Selyse Baratheon".equals(second)){
             ret = "Nephew";
             }
             if("Gendry".equals(first) && "Selyse Baratheon".equals(second)){
             ret = "Nephew";
             }
             if("Myrcella Baratheon".equals(first) && "Selyse Baratheon".equals(second)){
             ret = "Niece";
             }
             if("Tommen Baratheon".equals(first) && "Selyse Baratheon".equals(second)){
             ret = "Nephew";
             } 
             if("Joffrey Baratheon".equals(first) && "Renly Baratheon".equals(second)){
             ret = "Nephew";
             }
             if("Gendry".equals(first) && "Renly Baratheon".equals(second)){
             ret = "Nephew";
             }
             if("Myrcella Baratheon".equals(first) && "Renly Baratheon".equals(second)){
             ret = "Niece";
             }
             if("Tommen Baratheon".equals(first) && "Renly Baratheon".equals(second)){
             ret = "Nephew";
             }
             if("Shireen Baratheon".equals(first) && "Renly Baratheon".equals(second)){
             ret = "Nephew";
             }
             if("Joffrey Baratheon".equals(first) && "Magaery Tyrell".equals(second)){
             ret = "Nephew";
             }
             if("Gendry".equals(first) && "Magaery Tyrell".equals(second)){
             ret = "Nephew";
             }
             if("Myrcella Baratheon".equals(first) && "Magaery Tyrell".equals(second)){
             ret = "Niece";
             }
             if("Tommen Baratheon".equals(first) && "Magaery Tyrell".equals(second)){
             ret = "Nephew";
             }
             if("Shireen Baratheon".equals(first) && "Magaery Tyrell".equals(second)){
             ret = "Nephew";
             }
             return ret;    

    }

    public static String NoRelation(String f,String s){
        String first = f;
        String second = s;
        String ret = "No relation";

        if("".equals(first) || "".equals(second)){
            ret = "Name not Found";
        }

        return ret;
    }

}


