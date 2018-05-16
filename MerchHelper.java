import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;

import static java.awt.event.KeyEvent.*;
import static java.awt.event.KeyEvent.VK_SLASH;
import static java.awt.event.KeyEvent.VK_SPACE;


public class MerchHelper {

        public static void main(String[] args) throws AWTException, IOException, URISyntaxException, InterruptedException {
            int shirts = 0;
            WhatToDo(shirts);

        }

    private static void WhatToDo(int shirts) throws AWTException, IOException, URISyntaxException, InterruptedException {
        Robot robot = new Robot();
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("1: Hämta Tröjor, 2: Öppna Nya Tabs för Merch, 3: Ladda upp tröjor, 4: AI Process");
        int n = reader.nextInt(); // Scans the next token of the input as an int.

        switch (n){
            case 1:
                int lineNumber = 0;
                robot.delay(2000);
                gatherTees(lineNumber);
                break;
            case 2:
                robot.delay(2000);
                startTab();
                break;
            case 3:
                robot.delay(2000);
                uploadShirts(shirts);
                break;
            case 4:
                robot.delay(2000);
                aiProcess();
        }

        //once finished
        reader.close();

    }

    private static void aiProcess() throws AWTException {
        int loopen = 0;
        while (loopen < 50) {
            Robot robot = new Robot();
            //move to 1623 213
            robot.delay(200);
            robot.mouseMove(1623, 213);
            //hold left click
            robot.delay(200);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            //drag into .ai program 537 570
            robot.delay(200);
            robot.mouseMove(539, 539); //537 547  541 539   539 539
            robot.delay(200);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.delay(200);
            //left click
            robot.delay(200);
            leftClick();
            robot.delay(200);
            //hold left click
            robot.delay(200);
            rightClick();
            robot.delay(1000);
            robot.mouseMove(755, 643);
            robot.delay(1000);
            robot.mouseMove(788, 643);
            robot.delay(1000);
            robot.mouseMove(835, 746);
            leftClick();
            pressEnter();
        /*robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        //drag to 426 425(corner)
        robot.delay(200);
        robot.mouseMove(426, 425);
        //release left click
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseMove(423, 432);
        leftClick();*/
            //move to 446 445
       /* robot.delay(500);
        robot.mouseMove(446, 447);
        robot.delay(2000);
        //hold shift
        robot.delay(2000);*/
        /*robot.keyPress(KeyEvent.VK_SHIFT);
        robot.delay(2000);
        //hold left click
        robot.mousePress(InputEvent.BUTTON1_MASK);
        //move to 729 670
        robot.delay(2000);
        robot.mouseMove(729, 670);
        //release left click
        robot.delay(2000);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(2000);
        robot.keyRelease(KeyEvent.VK_SHIFT);*/
            //robot.delay(2000);
            //move to 35 66
            robot.delay(200);
            robot.mouseMove(35, 66);
            robot.delay(200);
            //leftclick
            robot.delay(200);
            leftClick();
            robot.delay(200);
            //move to 82 478
            robot.delay(200);
            robot.mouseMove(82, 478);
            //leftclick
            robot.delay(200);
            leftClick();
            robot.delay(200);
            //move to 783 609
            robot.delay(200);
            robot.mouseMove(783, 609);
            //leftclick
            robot.delay(200);
            leftClick();
            robot.delay(200);
            //move to 732 861
            robot.delay(200);
            robot.mouseMove(732, 861);
            //leftclick
            robot.delay(200);
            leftClick();
            robot.delay(200);
            //move to 245 708
            robot.delay(200);
            robot.mouseMove(245, 708);
            //leftclick
            robot.delay(200);
            leftClick();
            robot.delay(200);
            //move to 248 777
            robot.delay(200);
            robot.mouseMove(248, 777);
            //leftclick
            robot.delay(200);
            leftClick();
            robot.delay(200);
            //move to 377 810
            robot.mouseMove(377, 810);
            //leftclick
            robot.delay(200);
            leftClick();
            robot.delay(200);
            //press backspace 2 times
            //pressBackspace();
            // robot.delay(200);
            //pressBackspace();
            robot.delay(200);
            //move to 1623 234
            robot.mouseMove(1623, 234);
            //rightclick
            robot.delay(200);
            rightClick();
            robot.delay(200);
            //move to rename file 1729 884
            robot.mouseMove(1746, 919);
            //leftclick
            robot.delay(200);
            leftClick();
            //press ctrl c
            robot.delay(200);
            ctrlC();
            robot.delay(200);
            //move to 1621 222
            robot.delay(200);
            robot.mouseMove(1621, 222);
            //leftclick
            robot.delay(200);
            leftClick();
            //press delete
            //pressDelete();
            //press enter
            //pressEnter();
            //move to file name 791 568
            robot.mouseMove(791, 568);
            //leftclick
            leftClick();
            //press ctrl A
            ctrlA();
            //press sudda
            //pressBackspace();
            //press ctrl V
            ctrlV();
            //press enter
            pressEnter();
            //press enter
            pressEnter();
            robot.delay(10000);
            //move to shirt to delete from AI
            robot.mouseMove(532, 543);
            leftClick();
            pressDelete();
            //delete from shirts(so we can automate it with a loop!)
            robot.mouseMove(1609, 214);
            leftClick();
            pressDelete();
            pressEnter();
            loopen++;
        }
    }

    private static void ctrlA() throws AWTException {
        Robot robot = new Robot();
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_A);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_A);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(200);


    }

    private static void ctrlV() throws AWTException {
        Robot robot = new Robot();
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(200);


    }

    private static void pressShift() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.delay(200);

    }

    private static void ctrlC() throws AWTException {
        Robot robot = new Robot();
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_C);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_C);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(200);


    }

    private static void pressDelete() throws AWTException {
        Robot robot = new Robot();
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_DELETE);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DELETE);
        robot.delay(200);
    }

    private static void pressBackspace() throws AWTException {
        Robot robot = new Robot();
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(200);


    }

    private static void uploadShirts(int shirts) throws AWTException {
            /*//dra till 695 1376 vänsterklicka på knappen(upload)
            pressUploadButton();
            //vänsterklicka på den senaste bilden 349 225
            leftClickLatestPicture();
            //klicka open 222 1056
            pressOpen();
            //klicka nästa tab 156 16
            robot.mouseMove(156,16);
            robot.delay(200;
            leftClick();*/
            Robot robot = new Robot();

            ///LOOP-delen!
            while (shirts < 24){
            //vänsterklicka på knappen(upload) 695 1376
            pressUploadButton();
            leftClickLatestPicture();
            deletePic();
            pressEnter();
            leftClickLatestPicture();
            pressEnter();
            //pressOpen();
            clickNextTab(shirts);
            //vänsterklicka på den senaste bilden 349 225
            //klicka open 222 1056

            //klicka nästa tab (måste göra en switch för koordinaterna för ny tab!) X: 222 322 422 522 osv 23 gånger. 442 Y: 24 på alla
            //efter 25 loopningar, gå tillbaks till tab 2 och klicka på skärmen 1133 912, sedan "save and continue"  1434 1318
            shirts++;
                /*if (shirts >= 200){
                    int shirts2 = 0;
                    shirts2++;
                    if (shirts2 <= 24){
                    clickNextTab(shirts);
                        robot.mouseMove(1133,912);
                        robot.delay(200;
                        leftClick();
                        robot.mouseMove(1434,1318);
                        robot.delay(200;
                        leftClick();
            }*/
        }

    }



    private static void deletePic() throws AWTException {
        Robot robot = new Robot();
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_DELETE);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DELETE);
        robot.delay(200);
    }

    private static void rightClickLastestPicture() throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(349, 225);
        robot.delay(200);
        rightClick();
    }

    private static void rightClick() throws AWTException {
        Robot robot = new Robot();
        robot.delay(200);
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        robot.delay(200);

    }

    private static void leftClick() throws AWTException {
        Robot robot = new Robot();
        robot.delay(200);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }

    private static void pressOpen() throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(1473, 899);
        robot.delay(200);
        leftClick();
        robot.delay(200);
    }

    private static void clickNextTab(int shirts) throws AWTException {
        Robot robot = new Robot();
            switch (shirts){
                    case 1: robot.mouseMove(222, 24);
                        leftClick();
                        break;
                    case 2: robot.mouseMove(322, 24);
                        leftClick();
                        break;
                    case 3: robot.mouseMove(422, 24);
                        leftClick();
                        break;
                    case 4: robot.mouseMove(522, 24);
                        leftClick();
                        break;
                    case 5: robot.mouseMove(622, 24);
                        leftClick();
                        break;
                    case 6: robot.mouseMove(722, 24);
                        leftClick();
                        break;
                    case 7: robot.mouseMove(822, 24);
                        leftClick();
                        break;
                    case 8: robot.mouseMove(922, 24);
                        leftClick();
                        break;
                    case 9: robot.mouseMove(1022, 24);
                        leftClick();
                        break;
                    case 10: robot.mouseMove(1122, 24);
                        leftClick();
                        break;
                    case 11: robot.mouseMove(1222, 24);
                        leftClick();
                        break;
                    case 12: robot.mouseMove(1322, 24);
                        leftClick();
                        break;
                    case 13: robot.mouseMove(1422, 24);
                        leftClick();
                        break;
                    case 14: robot.mouseMove(1522, 24);
                        leftClick();
                        break;
                    case 15: robot.mouseMove(1622, 24);
                        leftClick();
                        break;
                    case 16: robot.mouseMove(1722, 24);
                        leftClick();
                        break;
                    case 17: robot.mouseMove(1822, 24);
                        leftClick();
                        break;
                    case 18: robot.mouseMove(1922, 24);
                        leftClick();
                        break;
                    case 19: robot.mouseMove(2022, 24);
                        leftClick();
                        break;
                }
            }

    private static void leftClickLatestPicture() throws AWTException {
        Robot robot = new Robot();
        robot.delay(200);
        robot.mouseMove(349, 225);
        robot.delay(200);
        leftClick();

    }

    private static void pressUploadButton() throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(695, 1376);
        robot.delay(200);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);

    }

    private static void gatherTees(int lineNumber) throws AWTException, InterruptedException, IOException {

        //Fråga 1: hur många nyckelord. skriv ett eller flera "sökord" tex "coffee". skriv "done" när klar.
            /*List<String> nyckelOrd = new ArrayList<String>();
            int antalNyckelOrd = 0;

            Robot robot = new Robot();
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("Hur många nyckelord?");
            antalNyckelOrd = reader.nextInt(); // Scans the next token of the input as an string.

            for(int i = 0; i < antalNyckelOrd; i++) {
                String sokOrd = reader.nextLine();
                System.out.print("Skriv ditt sökord, klicka enter mellan varje: ");
                nyckelOrd.add(sokOrd);
        }*/
        //Fråga 2: hur många tröjor skall laddas ner för varje nyckelord?.
        //Scanner hurMangaTrojor = new Scanner(System.in);  // Reading from System.in
        //System.out.println("Hur många tröjor för varje nyckelord?");
        //int trojor = hurMangaTrojor.nextInt();
        Robot robot = new Robot();
        //FileReader file = new FileReader("C:\\Users\\Swagmaster\\Desktop\\AMAZON MERCH\\Tees.txt");
        //BufferedReader reader = new BufferedReader(file);
        BufferedReader br = new BufferedReader (new FileReader ("C:\\\\Users\\\\Swagmaster\\\\Desktop\\\\AMAZON MERCH\\\\Tees.txt"));
        String line;
        //sök baserat på 1:a input(sökordet) från användaren
            while ((line = br.readLine()) != null) {
               int trojor = 15;
            pressSpreadShirtSearch();
            //int length = characters.length();
            for (int i = 0; i < line.length(); i++) {
                robot.delay(20);
                char character = line.charAt(i);
                GetCharacter(character);
                robot.delay(50);
            }
            int movedown = 0;

            pressEnter();
            while (trojor > 0) {
                //öppna och spara första tröjan
                robot.delay(3000);
                openshirt1();
                trojor--;
                //repetera process för nästa tröja, repetera x antal gånger
                robot.delay(3000);
                openshirt2();
                robot.delay(3000);
                trojor--;
                openshirt3();
                robot.delay(3000);
                trojor--;
                movedown++;
                movedown(movedown);
                robot.delay(3000);
            }
                    spreadShirtHomePage();
        }
            /*Iterator<String> iterator = nyckelOrd.iterator();
            while (iterator.hasNext()) {
            for (int i = 0; i < nyckelOrd.size(); i++) {
                char character = nyckelOrd.indexOf(i);
                GetCharacter(character);
            }*/
        //tryck enter

    }

    private static void spreadShirtHomePage() throws AWTException {
        Robot robot = new Robot();
        robot.delay(200);
        robot.mouseMove(1268, 227);
        robot.delay(200);
        leftClick();
        }

    private static void movedown(int movedown) throws AWTException {
            Robot robot = new Robot();
            switch (movedown){
                case 1: robot.mouseMove(2543, 232);
                robot.delay(200);
                leftClick();
                    break;
                case 2: robot.mouseMove(2543, 285);
                robot.delay(200);
                leftClick();
                    break;
                case 3: robot.mouseMove(2545, 333);
                robot.delay(200);
                leftClick();
                    break;
                case 4: robot.mouseMove(2551, 388);
                robot.delay(200);
                leftClick();
                    break;
                case 5: robot.mouseMove(2545, 333);
                robot.delay(200);
                leftClick();
                    break;
                case 6: robot.mouseMove(2545, 432);
                robot.delay(200);
                leftClick();
                    break;
                case 7: robot.mouseMove(2545, 485);
                robot.delay(200);
                leftClick();
                    break;
                case 8: robot.mouseMove(2545, 538);
                robot.delay(200);
                leftClick();
                    break;
                case 9: robot.mouseMove(2545, 581);
                robot.delay(200);
                leftClick();
                    break;
            }

    }

    private static void openshirt3() throws AWTException {
        //öppna nya tabs med tröjor(ctrl+vänster fungerar ej), måste högerklicka 978 777   1065 801   453 48
        //blädda ner till design details
        //högerklicka på bilden, öppna bild i ny flik.
        //högerklick i mitten av skärmen på bilden, "SAVE as PNG"
        //tryck enter
        //tryck på x för att kryssa ner tab 1
        //tryck på x igen för att kryssa ner tab 2
        Robot robot = new Robot();
        robot.delay(200);
        robot.mouseMove(2136, 812);
        robot.delay(200);
        rightClick();
        robot.delay(200);
        robot.mouseMove(2208, 835);
        robot.delay(200);
        leftClick();
        robot.mouseMove(444, 20);
        leftClick();
        robot.delay(3000);
        //inspektera 1258 412
        robot.mouseMove(1247, 400);
        ctrlU();
        robot.delay(10000);
        ctrlF();
        pressEnter();
        robot.mouseMove(703, 703);
        leftClick();
        robot.mouseMove(1281, 743);
        rightClick();
        robot.mouseMove(1408, 991);
        leftClick();
        pressEnter();
        robot.mouseMove(573, 24);
        leftClick();
        leftClick();
        leftClick();
    }

    private static void ctrlF() throws AWTException {
        Robot robot = new Robot();
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_F);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_F);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(200);
    }

    private static void ctrlU() throws AWTException {
        Robot robot = new Robot();
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_U);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_U);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(200);
    }

    private static void openshirt2() throws AWTException {
        //öppna nya tabs med tröjor(ctrl+vänster fungerar ej), måste högerklicka 978 777   1065 801   453 48
        //blädda ner till design details
        //högerklicka på bilden, öppna bild i ny flik.
        //högerklick i mitten av skärmen på bilden, "SAVE as PNG"
        //tryck enter
        //tryck på x för att kryssa ner tab 1
        //tryck på x igen för att kryssa ner tab 2
        Robot robot = new Robot();
        robot.delay(200);
        robot.mouseMove(1533, 812);
        robot.delay(200);
        rightClick();
        robot.delay(200);
        robot.mouseMove(1660, 837);
        robot.delay(200);
        leftClick();
        robot.mouseMove(444, 20);
        leftClick();
        robot.delay(3000);
        //inpektera element
        robot.mouseMove(1247, 400);
        ctrlU();
        robot.delay(10000);
        ctrlF();
        pressEnter();
        robot.mouseMove(703, 703);
        leftClick();
        robot.mouseMove(1281, 743);
        rightClick();
        robot.mouseMove(1408, 991);
        leftClick();
        pressEnter();
        robot.mouseMove(573, 24);
        leftClick();
        leftClick();
        leftClick();

    }

    private static void openshirt1() throws AWTException {
        //öppna nya tabs med tröjor(ctrl+vänster fungerar ej), måste högerklicka 978 777   1065 801   453 48
        //blädda ner till design details
        //högerklicka på bilden, öppna bild i ny flik.
        //högerklick i mitten av skärmen på bilden, "SAVE as PNG"
        //tryck enter
        //tryck på x för att kryssa ner tab 1
        //tryck på x igen för att kryssa ner tab 2
        Robot robot = new Robot();
        robot.delay(200);
        robot.mouseMove(971, 793);
        robot.delay(200);
        rightClick();
        robot.delay(200);
        robot.mouseMove(1065, 801);
        robot.delay(200);
        leftClick();
        robot.mouseMove(444, 20);
        leftClick();
        robot.delay(3000);
        //inspektera
        robot.mouseMove(1247, 400);
        ctrlU();
        robot.delay(10000);
        ctrlF();
        pressEnter();
        robot.mouseMove(703, 703);
        leftClick();
        robot.mouseMove(1281, 743);
        rightClick();
        robot.mouseMove(1408, 991);
        leftClick();
        pressEnter();
        robot.mouseMove(573, 24);
        leftClick();
        leftClick();
        leftClick();
    }

    private static void pressSpreadShirtSearch() throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(1586, 285);
        robot.delay(200);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }

    private static void pressEnter() throws AWTException {
        Robot robot = new Robot();
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(200);

    }

    private static void pastelink() throws AWTException {
        Robot robot = new Robot();
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(200);

    }

    private static void copyLink() throws AWTException {
        Robot robot = new Robot();
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_C);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_C);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(200);

    }

    private static void openTab() throws AWTException {
        Robot robot = new Robot();
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_T);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_T);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(200);


    }

    private static void startTab() throws AWTException, IOException, URISyntaxException {

            int numberOfTabs = 0;
            while (numberOfTabs <= 24) {
                openTab();
                pastelink();
                pressEnter();
                numberOfTabs++;
            }
        }

    public static void GetCharacter(char character) throws AWTException, InterruptedException {
        Robot bot = new Robot();
        Thread.sleep(10);
        switch (character) {
            case 'a':
                bot.keyPress(VK_A);
                break;
            case 'b':
                bot.keyPress(VK_B);
                break;
            case 'c':
                bot.keyPress(VK_C);
                break;
            case 'd':
                bot.keyPress(VK_D);
                break;
            case 'e':
                bot.keyPress(VK_E);
                break;
            case 'f':
                bot.keyPress(VK_F);
                break;
            case 'g':
                bot.keyPress(VK_G);
                break;
            case 'h':
                bot.keyPress(VK_H);
                break;
            case 'i':
                bot.keyPress(VK_I);
                break;
            case 'j':
                bot.keyPress(VK_J);
                break;
            case 'k':
                bot.keyPress(VK_K);
                bot.keyRelease(VK_K);
                break;
            case 'l':
                bot.keyPress(VK_L);
                break;
            case 'm':
                bot.keyPress(VK_M);
                break;
            case 'n':
                bot.keyPress(VK_N);
                break;
            case 'o':
                bot.keyPress(VK_O);
                break;
            case 'p':
                bot.keyPress(VK_P);
                break;
            case 'q':
                bot.keyPress(VK_Q);
                break;
            case 'r':
                bot.keyPress(VK_R);
                break;
            case 's':
                bot.keyPress(VK_S);
                break;
            case 't':
                bot.keyPress(VK_T);
                break;
            case 'u':
                bot.keyPress(VK_U);
                break;
            case 'v':
                bot.keyPress(VK_V);
                break;
            case 'w':
                bot.keyPress(VK_W);
                break;
            case 'x':
                bot.keyPress(VK_X);
                break;
            case 'y':
                bot.keyPress(VK_Y);
                break;
            case 'z':
                bot.keyPress(VK_Z);
                break;
            case 'A':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_A);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'B':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_B);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'C':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_C);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'D':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_D);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'E':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_E);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'F':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_F);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'G':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_G);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'H':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_H);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'I':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_I);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'J':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_J);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'K':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_K);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'L':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_L);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'M':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_M);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'N':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_N);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'O':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_O);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'P':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_P);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'Q':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_Q);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'R':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_R);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'S':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_S);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'T':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_T);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'U':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_U);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'V':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_V);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'W':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_W);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'X':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_X);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'Y':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_Y);
                bot.keyRelease(VK_SHIFT);
                break;
            case 'Z':
                bot.keyPress(VK_SHIFT);
                bot.keyPress(VK_Z);
                bot.keyRelease(VK_SHIFT);
                break;
            case '`':
                bot.keyPress(VK_BACK_QUOTE);
                break;
            case '0':
                bot.keyPress(VK_0);
                break;
            case '1':
                bot.keyPress(VK_1);

                break;
            case '2':
                bot.keyPress(VK_2);

                break;
            case '3':
                bot.keyPress(VK_3);

                break;
            case '4':
                bot.keyPress(VK_4);
                break;
            case '5':
                bot.keyPress(VK_5);
                break;
            case '6':
                bot.keyPress(VK_6);
                break;
            case '7':
                bot.keyPress(VK_7);
                break;
            case '8':
                bot.keyPress(VK_8);
                break;
            case '9':
                bot.keyPress(VK_9);
                break;
            case '-':
                bot.keyPress(VK_ALT);
                bot.keyPress(VK_NUMPAD4);
                bot.keyPress(VK_NUMPAD5);
                bot.keyRelease(VK_ALT);
                break;
            case '=':
                bot.keyPress(VK_ALT);
                bot.keyPress(VK_NUMPAD6);
                bot.keyPress(VK_NUMPAD1);
                bot.keyRelease(VK_ALT);
                break;
            case '~':
                bot.keyPress(VK_CAPS_LOCK);
                bot.keyPress(VK_BACK_QUOTE);
                break;
            case '!':
                bot.keyPress(VK_ALT);
                bot.keyPress(VK_NUMPAD3);
                bot.keyPress(VK_NUMPAD3);
                bot.keyRelease(VK_ALT);
                break;
            case '@':
                bot.keyPress(VK_ALT);
                bot.keyPress(VK_NUMPAD6);
                bot.keyPress(VK_NUMPAD4);
                bot.keyRelease(VK_ALT);
                break;
            case '#':
                bot.keyPress(VK_ALT);
                bot.keyPress(VK_NUMPAD3);
                bot.keyPress(VK_NUMPAD5);
                bot.keyRelease(VK_ALT);
                break;
            case '$':
                bot.keyPress(VK_ALT);
                bot.keyPress(VK_NUMPAD3);
                bot.keyPress(VK_NUMPAD6);
                bot.keyRelease(VK_ALT);
                break;
            case '%':
                bot.keyPress(VK_ALT);
                bot.keyPress(VK_NUMPAD3);
                bot.keyPress(VK_NUMPAD7);
                bot.keyRelease(VK_ALT);
                break;
            case '^':
                bot.keyPress(VK_CIRCUMFLEX);
                break;
            case '&':
                bot.keyPress(VK_ALT);
                bot.keyPress(VK_NUMPAD3);
                bot.keyPress(VK_NUMPAD8);
                bot.keyRelease(VK_ALT);
                break;
            case '*':
                bot.keyPress(VK_ALT);
                bot.keyPress(VK_NUMPAD4);
                bot.keyPress(VK_NUMPAD2);
                bot.keyRelease(VK_ALT);
                break;
            case '(':
                bot.keyPress(VK_ALT);
                bot.keyPress(VK_NUMPAD4);
                bot.keyPress(VK_NUMPAD0);
                bot.keyRelease(VK_ALT);
                break;
            case ')':
                bot.keyPress(VK_ALT);
                bot.keyPress(VK_NUMPAD4);
                bot.keyPress(VK_NUMPAD1);
                bot.keyRelease(VK_ALT);
                break;
            case '_':
                bot.keyPress(VK_ALT);
                bot.keyPress(VK_NUMPAD9);
                bot.keyPress(VK_NUMPAD5);
                bot.keyRelease(VK_ALT);
                break;
            case '+':
                bot.keyPress(VK_PLUS);
                break;
            case '\t':
                bot.keyPress(VK_TAB);
                break;
            case '\n':
                bot.keyPress(VK_ENTER);
                break;
            case '[':
                bot.keyPress(VK_OPEN_BRACKET);
                break;
            case ']':
                bot.keyPress(VK_CLOSE_BRACKET);
                break;
            case '\\':
                bot.keyPress(VK_BACK_SLASH);
                break;
            case '{':
                bot.keyPress(VK_CAPS_LOCK);
                bot.keyPress(VK_OPEN_BRACKET);
                break;
            case '}':
                bot.keyPress(VK_CAPS_LOCK);
                bot.keyPress(VK_CLOSE_BRACKET);
                break;
            case '|':
                bot.keyPress(VK_CAPS_LOCK);
                bot.keyPress(VK_BACK_SLASH);
                break;
            case ';':
                bot.keyPress(VK_SEMICOLON);
                break;
            case ':':
                bot.keyPress(VK_ENTER);
                break;
            case '\'':
                bot.keyPress(VK_QUOTE);
                break;
            case '"':
                bot.keyPress(VK_QUOTEDBL);
                break;
            case ',':
                bot.keyPress(VK_COMMA);
                break;
            case '<':
                bot.keyPress(VK_CAPS_LOCK);
                bot.keyPress(VK_COMMA);
                break;
            case '.':
                bot.keyPress(VK_PERIOD);
                break;
            case '>':
                bot.keyPress(VK_CAPS_LOCK);
                bot.keyPress(VK_PERIOD);
                break;
            case '/':
                bot.keyPress(VK_SLASH);
                break;
            case '?':
                bot.keyPress(VK_CAPS_LOCK);
                bot.keyPress(VK_SLASH);
                break;
            case ' ':
                bot.keyPress(VK_SPACE);
                break;
            default:
                throw new IllegalArgumentException("Cannot type character " + character);
        }
    }
}
