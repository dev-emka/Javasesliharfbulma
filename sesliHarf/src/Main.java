public class Main{


    public static void main(String[] args) {
        char[] sesliHarf={'a','e','ı','i','o','ö','u','ü'};
        String istiklalMarsi="Korkma, sönmez bu şafaklarda yüzen al sancak Sönmeden yurdumun üstünde tüten en son ocak. O benim milletimin yıldızıdır, parlayacak O benimdir, o benim milletimindir ancak. Çatma, kurban olayım çehreni ey nazlı hilâl! Kahraman ırkıma bir gül… ne bu şiddet bu celâl? Sana olmaz dökülen kanlarımız sonra helâl, Hakkıdır, Hakk’a tapan, milletimin istiklâl. Ben ezelden beridir hür yaşadım, hür yaşarım. Hangi çılgın bana zincir vuracakmış? Şaşarım!Kükremiş sel gibiyim bendimi çiğner, aşarım Yırtarım dağları, enginlere sığmam, taşarım.Garb’ın âfâkını sarmışsa çelik zırhlı duvar Benim iman dolu göğsüm gibi serhaddim var.Ulusun, korkma! Nasıl böyle bir îmânı boğar, Medeniyet! dediğin tek dişi kalmış canavar? Arkadaş! Yurduma alçakları uğratma sakın Siper et gövdeni, dursun bu hayâsızca akın. Doğacaktır sana va’dettiği günler Hakk’ın… Kim bilir, belki yarın… belki yarından da yakın. Bastığın yerleri toprak! diyerek geçme, tanı! Düşün altındaki binlerce kefensiz yatanı. Sen şehîd oğlusun, incitme, yazıktır atanı Verme, dünyâları alsan da, bu cennet vatanı. Kim bu cennet vatanın uğruna olmaz ki fedâ? Şühedâ fışkıracak, toprağı sıksan şühedâ! Cânı, cânânı, bütün varımı alsın da Hudâ, Etmesin tek vatanımdan beni dünyâda cüdâ Ruhumun senden, İlâhî, şudur ancak emeli Değmesin ma’bedimin göğsüne nâ-mahrem eli! Bu ezanlar-ki şehâdetleri dînin temeli Ebedî yurdumun üstünde benim inlemeli O zaman vecd ile bin secde eder –varsa- taşım Her cerîhamdan, İlâhî, boşanıp kanlı yaşım, Fışkırır rûh-i mücerred gibi yerden na’şım O zaman yükselerek Arş’a değer, belki başım. Dalgalan sen de şafaklar gibi ey şanlı hilâl Olsun artık dökülen kanlarımın hepsi helâl. Ebediyen sana yok, ırkıma yok izmihlâl Hakkıdır, hür yaşamış bayrağımın hürriyet Hakkıdır, Hakk’a tapan milletimin istiklâl!";

        String iMarsi=istiklalMarsi.toLowerCase();

        int  sesliadet=0;
        for(int i=0;i<iMarsi.length();i++){
            for (int j=0;j<sesliHarf.length;j++)
            {
               if(iMarsi.charAt(i)==sesliHarf[j]){
                    sesliadet++;
               }
            }
        }
        System.out.println("toplamda"+sesliadet+" adet sesli harf var");

    }

}