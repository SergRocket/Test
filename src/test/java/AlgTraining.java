import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class AlgTraining {


    protected WebDriver driver;

   /* @BeforeMethod
    public void beforeLogin() {
        ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());
    }*/

   /* @AfterMethod
    public void shuttingDown() {
        driver.close();
        if (driver != null) {
            driver.quit();
        }
    }*/

    @Test
    public void waitFor(){
        waitForElement(5, 5);
    }
    public void waitForElement(long wait, long timeToWait){
        long time;
        long timeStop;
        long timeStart = System.currentTimeMillis();
        do {
            try {
                WebElement element = driver.findElement(By.id("#email"));
                Thread.sleep(wait);
                if(element != null){
                    break;
                }} catch (InterruptedException e) {
                e.printStackTrace();
            }
            timeStop = System.currentTimeMillis();
            time = timeStop - timeStart;
        } while (time<timeToWait);
    }

    @Test
    public void score(){
        String [] ops = new String []{"5", "2", "C", "D", "+"};
        List<Integer> resu = new ArrayList<>();
        String filter = ops[0];
        String filter1 = ops[1];
        String filter2 = ops[2];
        String filter3 = ops[3];
        String filter4 = ops[4];
        Arrays.sort(ops);
        for(String op:ops){
            if(op.startsWith(filter)){
                resu.add(Integer.valueOf(op));
            } else if(op.startsWith(filter1)){
                resu.add(Integer.valueOf(op));
            } else if(op.startsWith(filter2)){
                resu.remove(1);
            } else if(op.startsWith(filter3)){
                resu.add(10);
            } else if(op.startsWith(filter4)){
                resu.add(15);
            }
        }
        System.out.print(resu);
        Integer sum = resu.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.print(sum);
        String [] ops2 = new String []{"5", "-2", "4", "C", "D", "9", "+", "+"};
        List<Integer> resu2 = new ArrayList<>();
        String filters = ops2[0];
        String filters1 = ops2[1];
        String filters2 = ops2[2];
        String filters3 = ops2[3];
        String filters4 = ops2[4];
        String filters5 = ops2[5];
        String filters6 = ops2[6];
        Arrays.sort(ops2);
        for(String opi:ops2){
            if(opi.startsWith(filters)){
                resu2.add(Integer.valueOf(opi));
            } else if(opi.startsWith(filters1)){
                resu2.add(Integer.valueOf(opi));
            } else if(opi.startsWith(filters2)){
                resu2.add(Integer.valueOf(opi));
            } else if(opi.startsWith(filters3)){
                resu2.remove(2);
            } else if(opi.startsWith(filters4)){
                resu2.add(-4);
            } else if(opi.startsWith(filters5)){
                resu2.add(9);
            } else if(opi.startsWith(filters6)){
                resu2.add(5);
                resu2.add(14);
            }
        }
        System.out.print(resu);
        Integer sum2 = resu2.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.print(sum2);
        //String string = resu.stream().map(a->a.toString()).collect(Collectors.joining(", "));
        //int recorded = Integer.parseInt(string);
        // System.out.print(string);

    }

    public static int calPoints(String [] ops){
        List<Integer> resu = new ArrayList<>();
        String filter = ops[0];
        String filter1 = ops[1];
        String filter2 = ops[2];
        String filter3 = ops[3];
        String filter4 = ops[4];
        Arrays.sort(ops);
        for(String op:ops){
            if(op.startsWith(filter)){
                resu.add(Integer.valueOf(op));
            } else if(op.startsWith(filter1)){
                resu.add(Integer.valueOf(op));
            } else if(op.startsWith(filter2)){
                resu.remove(1);
            } else if(op.startsWith(filter3)){
                resu.add(10);
            } else if(op.startsWith(filter4)){
                resu.add(15);
            }
        }
        System.out.print(resu);
        Integer sum = resu.stream()
                .reduce(0, (a, b) -> a + b);
        return sum;
    }

    @Test
    public void callMethos(){

    }

    public static void main(String args[]){
        calPoints(new String[]{"5", "2", "C", "D", "+"});
    }

    @Test
    public void waitFors(){
        waitForElements(5, 5);
    }
    public void waitForElements(long wait, long timeToWait){
        long time;
        long timeStop;
        long timeStart = System.currentTimeMillis();
        do {
            try {
                WebElement element = driver.findElement(By.id("#email"));
                Thread.sleep(wait);
                if(element != null){
                    break;
                }} catch (InterruptedException e) {
                e.printStackTrace();
            }
            timeStop = System.currentTimeMillis();
            time = timeStop - timeStart;
        } while (time<timeToWait);
    }

    public static void ramdomInt(int max, int min){
        Random random = new Random();
        int n = max - min - 1;
        int i = random.nextInt() %n;
        int result = min +i;
        System.out.println(result);
    }

    public static void ramdomInt(int max, int min, String message){
        int difference = max - min;
        Random random = new Random();
        int result = random.nextInt(difference+1)+min;
        System.out.println(message);
        System.out.println(result);
    }

    public static void ramdomInt(int max, int min, String message, String finaly){
        int difference = max - min;
        long n = System.currentTimeMillis();
        int result = (int) (n / difference);
        int finResult = result + min;
        System.out.println(finResult);
    }

    @Test
    public void getRandom(){
        ramdomInt(12,9);
        ramdomInt(10,1, "Random will be: ");
        ramdomInt(1,20,"Number", "IS ");
    }

    public static long findNext(long sqr){
        if(sqr != Math.floor(Math.sqrt(sqr)) * Math.floor(Math.sqrt(sqr))){
            return -1;
        }
        double tmp = Math.sqrt(sqr);
        tmp++;
        return Math.round(tmp*tmp);

    }

    @Test
    public void callSqr(){
        findNext(121);
    }

    public static String getUniq(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(s2);
        String s3 = sb.toString();
        String res = "";
        for(int i = 0; i<s3.length(); i++){
            if(!res.contains(String.valueOf(s3.charAt(i)))){
                res +=s3.charAt(i);
            }
        }
        char[] chars = res.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
        return String.valueOf(chars);
    }

    @Test
    public void getUnique(){
        getUniq("fdsfsd", "etyet");
        Assert.assertEquals("abcdefghilnoprstu", getUniq("loopingisfunbutdangerous", "lessdangerousthancoding"));
        Assert.assertEquals("aehrsty", getUniq("aretheyhere", "yestheyarehere"));
        Assert.assertEquals("aehrsty", getUniq("aretheyhere", "yestheyarehere"));

    }

    public static String[] splitStr(String st){
        if (st.length()==0) return new String[0];

        // if not even, then add an underscore to the end
        if (st.length()%2!=0) {
            st+="_";
        }

        // determine the space needed for the return array
        int spaceNeeded = st.length()/2;

        // create a new array to populate and return
        String[] out = new String[spaceNeeded];

        // create an builder index
        int j = 0;

        // loop through the input string
        for (int i=0; i<st.length(); i++) {

            // create a new string to build
            StringBuilder sb = new StringBuilder();
            // add the current item
            sb.append(st.charAt(i));
            // add the next item
            sb.append(st.charAt(i+1));

            // populate our output string as we go
            out[j] = sb.toString();

            // increment both counters
            i++;
            j++;
        }

        // return the built string
        return out;
    }

    static String[] solution(String s) {
        return (s + (s.length() % 2 > 0 ? "_" : "")).split("(?<=\\G.{2})");
    }

    @Test
    public void splitStr(){
        splitStr("qwerty");
        String s = "abcde";
        Assert.assertEquals("Should handle odd string","[ab, cd, e_]", Arrays.toString(splitStr(s)));
        Assert.assertEquals("Should handle odd string","[ab, cd, e_]", Arrays.toString(splitStr(s)));
    }

    @Test
    public void anotherSplit(){
        solution("wweerpt");
        Assert.assertEquals("Should handle odd string","[ab, cd, e_]", Arrays.toString(solution("abcde")));
    }

    public static String makeReadable(int sec){
        int hourInSec = 3600;
        int minInSec = 60;
        String hh = Integer.toString((sec / hourInSec));
        String mm = Integer.toString((sec % hourInSec) / minInSec);
        String ss = Integer.toString(sec % minInSec);

        if(hh.length()==1){
            hh = "0" +hh;
        }
        if(mm.length()==1){
            mm = "0" + mm;
        }
        if(ss.length()==1){
            ss = "0" + ss;
        }
        return hh + ":" + mm + ":" + ss;
    }

    @Test
    public void mareReadableTime(){
        makeReadable(86399);
        Assert.assertEquals( "00:01:00", makeReadable(60));
    }

    public static String makeReadables(int seconds) {
        int h = seconds/60/60;
        int min = seconds/60%60;
        int sec = seconds%60;
        return String.format("%02d:%02d:%02d",h,min,sec);
    }

    public static int sumOfValuesinArray(int [] B){
        int maxSoFar = 0;
        int maxEndingHere = 0;

        for(int i : B){
            maxEndingHere = maxEndingHere + i;
            maxEndingHere = Integer.max(maxEndingHere, 0);
            maxSoFar = Integer.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    @Test
    public void getSumOfValues(){
        sumOfValuesinArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        Assert.assertEquals(6,sumOfValuesinArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
