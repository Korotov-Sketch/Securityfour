import java.io.*;
//
public class Encryptionator {
    public static void main(String[] args) throws Exception {
        FileInputStream inputIO = new FileInputStream("src/main/resources/Word.txt");

        FileReader fileReader = new FileReader("src/main/resources/Text.txt");
        BufferedReader TXTReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter("src/main/resources/TextWithWord.txt");
        BufferedWriter TxtWriter = new BufferedWriter(fileWriter);

        StringBuilder txt = new StringBuilder();
        String lin = TXTReader.readLine();
        txt.append(lin);
        while (lin != null) {
            lin = TXTReader.readLine();
            if (lin != null) { txt.append("\n" + lin); }
        }
        TXTReader.close();

        byte[] bytes = inputIO.readAllBytes();
        StringBuilder bitses = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            bitses.append(String.format("%8s", Integer.toBinaryString(bytes[i])).replace(" ", "0"));
        }

        char[] BitsOfSymbols = bitses.toString().toCharArray();
        char[] SymbolsOfText = txt.toString().toCharArray();
        int pos = 0;
        for (int i = 0; i < BitsOfSymbols.length; i++) {
            for (int j = pos; j < SymbolsOfText.length; j++) {
                if (SymbolsOfText[j] == 'e') {
                    pos = j + 1;
                    if (BitsOfSymbols[i] == '1') { SymbolsOfText[j] = 'е';}
                    break;
                }
                if (SymbolsOfText[j] == 'E') {
                    pos = j + 1;
                    if (BitsOfSymbols[i] == '1') { SymbolsOfText[j] = 'Е'; }
                    break;
                }
                if (SymbolsOfText[j] == 'T') {
                    pos = j + 1;
                    if (BitsOfSymbols[i] == '1') { SymbolsOfText[j] = 'Т'; }
                    break;
                }
                if (SymbolsOfText[j] == 'y') {
                    pos = j + 1;
                    if (BitsOfSymbols[i] == '1') { SymbolsOfText[j] = 'у'; }
                    break;
                }
                if (SymbolsOfText[j] == 'o') {
                    pos = j + 1;
                    if (BitsOfSymbols[i] == '1') { SymbolsOfText[j] = 'о'; }
                    break;
                }
                if (SymbolsOfText[j] == 'O') {
                    pos = j + 1;
                    if (BitsOfSymbols[i] == '1') { SymbolsOfText[j] = 'О'; }
                    break;
                }
                if (SymbolsOfText[j] == 'p') {
                    pos = j + 1;
                    if (BitsOfSymbols[i] == '1') { SymbolsOfText[j] = 'р'; }
                    break;
                }
                if (SymbolsOfText[j] == 'P') {
                    pos = j + 1;
                    if (BitsOfSymbols[i] == '1') { SymbolsOfText[j] = 'Р'; }
                    break;
                }
                if (SymbolsOfText[j] == 'a') {
                    pos = j + 1;
                    if (BitsOfSymbols[i] == '1') { SymbolsOfText[j] = 'а'; }
                    break;
                }
                if (SymbolsOfText[j] == 'A') {
                    pos = j + 1;
                    if (BitsOfSymbols[i] == '1') { SymbolsOfText[j] = 'А'; }
                    break;
                }
                if (SymbolsOfText[j] == 'H') {
                    pos = j + 1;
                    if (BitsOfSymbols[i] == '1') { SymbolsOfText[j] = 'Н'; }
                    break;
                }
                if (SymbolsOfText[j] == 'K') {
                    pos = j + 1;
                    if (BitsOfSymbols[i] == '1') { SymbolsOfText[j] = 'К'; }
                    break;
                }
                if (SymbolsOfText[j] == 'x') {
                    pos = j + 1;
                    if (BitsOfSymbols[i] == '1') { SymbolsOfText[j] = 'х'; }
                    break;
                }
                if (SymbolsOfText[j] == 'X') {
                    pos = j + 1;
                    if (BitsOfSymbols[i] == '1') { SymbolsOfText[j] = 'Х'; }
                    break;
                }
                if (SymbolsOfText[j] == 'c') {
                    pos = j + 1;
                    if (BitsOfSymbols[i] == '1') { SymbolsOfText[j] = 'с'; }
                    break;
                }
                if (SymbolsOfText[j] == 'C') {
                    pos = j + 1;
                    if (BitsOfSymbols[i] == '1') { SymbolsOfText[j] = 'с'; }
                    break;
                }
                if (SymbolsOfText[j] == 'B') {
                    pos = j + 1;
                    if (BitsOfSymbols[i] == '1') { SymbolsOfText[j] = 'В'; }
                    break;
                }
                if (SymbolsOfText[j] == 'M') {
                    pos = j + 1;
                    if (BitsOfSymbols[i] == '1') { SymbolsOfText[j] = 'М'; }
                    break;
                }
            }
        }

        TxtWriter.write(SymbolsOfText);
        TxtWriter.close();
    }
}