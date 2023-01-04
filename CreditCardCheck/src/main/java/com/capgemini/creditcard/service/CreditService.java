package com.capgemini.creditcard.service;
/*
 * package com.capgemini.credicard.service;
 * 
 * import org.springframework.stereotype.Service;
 * 
 * @Service public class CreditService { long firstdigit; long creditcardnbr;
 * 
 * int count=0; public String findByCardnum(Long cardnum) {
 * creditcardnbr=cardnum;
 * 
 * while(creditcardnbr!=0) { firstdigit=creditcardnbr;
 * creditcardnbr=creditcardnbr/10; count++; }
 * 
 * String s=String.valueOf(cardnum); String s1=s.substring(0, 6);
 * System.out.println(s); System.out.println(s1);
 * 
 * int i=Integer.parseInt(s1); if(i>=601100&i<=601109) {return "Discover";} else
 * if(i>=601120&i<=601149) {return "Discover";} else if(i==601174) {return
 * "Discover";} else if(i>=601177&i<=601179) {return "Discover";} else
 * if(i>=601186&i<=601199) {return "Discover";} else if(i>644000&i<=659999)
 * {return "Discover";}
 * 
 * String s3=s.substring(0, 4); int i1=Integer.parseInt(s3); if(i1==2014
 * |i1==2149 & count==15) { return "Card is Valid and Card name is:enRoute"; }
 * 
 * if(firstdigit==2 && count==16) { return "American Express"; } else
 * if(firstdigit==5 && count==16) { return "MasterCard"; } else if(firstdigit==4
 * && count==19) { return "Visa"; } else {return
 * "firstdigit number:"+firstdigit;}
 * 
 * 
 * 
 * }
 * 
 * }
 */