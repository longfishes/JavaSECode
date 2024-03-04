package com.longfish.lc.month11_2;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class exer17 {
    public int uniqueLetterString(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                count += f(s.substring(i,j+1));
            }
        }

        return count;
    }

    public int f(String str){
        Set<Character> set = new HashSet<>();
        Set<Character> flag = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.charAt(i))){
                flag.add(str.charAt(i));
            }
            set.add(str.charAt(i));
        }
        for (int i = 0; i < flag.size(); i++) {
            set.remove((Character) flag.toArray()[i]);
        }
        return set.size();
    }

    @Test
    public void test1(){
        System.out.println(f("qwertyunmkkkkkll"));
    }

    @Test
    public void test2(){
        System.out.println(uniqueLetterString("DELQGVWNZKIJJPSXOVWWIZUXCEGWSQLESNSRBMKZARFPAX" +
                "SVWQEZDENDAHNNIBHGHTFDLPGDLFXMIYRFNLMXHNPIFUAXINXPXLCTTJNLGGMKJIOEWBECNOFQPVCIKIAZMNG" +
                "HEHFMCPWSMJTMGVSXTOGCGUYKFMNCGLCBRAFJLJVPIVDOLJBURULPGXBVDCEWXXXLTRMSHPKSPFDGNVOCZWD" +
                "XJUWVNAREDOKTZMIUDKDQWWWSAEUUDBHMWZELOSBIHMAYJEMGZPMDOOGSCKLVHTGMETHUISCLJKDOQEWGVBU" +
                "LEMUXGTRKGXYFDIZTZWMLOFTCANBGUARNWQEQWGMIKMORVQUZANJNRNPMJWYLVHWKDFLDDBBMILAKGFROEQAM" +
                "EVONUVHOHGPKLBPNYZFPLXNBCIFENCGIMIDCXIIQJWPVVCOCJTSKSHVMQJNLHSQTEZQTTMOXUSKBMUJEJDBJQN" +
                "XECJGSZUDENJCPTTSREKHPRIISXMWBUGMTOVOTRKQCFSDOTEFPSVQINYLHXYVZTVAMWGPNKIDLOPGAMWSKDXEPL" +
                "PPTKUHEKBQAWEBMORRZHBLOGIYLTPMUVBPGOOOIEBJEGTKQKOUURHSEJCMWMGHXYIAOGKJXFAMRLGTPNSLERNO" +
                "HSDFSSFASUJTFHBDMGBQOKZRBRAZEQQVWFRNUNHBGKRFNBETEDJIWCTUBJDPFRRVNZENGRANELPHSDJLKVHWXA" +
                "XUTMPWHUQPLTLYQAATEFXHZARFAUDLIUDEHEGGNIYICVARQNRJJKQSLXKZZTFPVJMOXADCIGKUXCVMLPFJGVXM" +
                "MBEKQXFNXNUWOHCSZSEZWZHDCXPGLROYPMUOBDFLQMTTERGSSGVGOURDWDSEXONCKWHDUOVDHDESNINELLCTUR" +
                "JHGCJWVIPNSISHRWTFSFNRAHJAJNNXKKEMESDWGIYIQQRLUUADAXOUEYURQRVZBCSHXXFLYWFHDZKPHA" +
                "GYOCTYGZNPALAUZSTOU"));
    }
}
