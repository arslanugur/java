import java.lang.reflect.Array;
import java.util.ArrayList;

public class test {

    public static boolean arraylistContains(int[] islandCoordinates, ArrayList<int[]> islands){
        for(int[] island: islands) {
            if(island[0] == islandCoordinates[0] && island[1] == islandCoordinates[1])
                return true;
        }
        return false;
    }

    public static ArrayList<int[]> findBorders(int[][] array, ArrayList<int[]> islands) {
        ArrayList<int[]> borders = new ArrayList<>();

       // 2. TEXT yeni bir metod oluşturacağız bu metodun neyi return edeceği bizim için önemli
       // bizim koordinatlara ihtiyacımız var x ve y koordinatları -- her bir 1 noktası için
       // array listi return edelim ve bu listenin içinde de iki elemanlı arrayler olsun
       // bu arraylaerin içinde x ve y koordinatları yer alacak
 
      
      // arraylist'in içinde olan array integer arrayi. bu array list içinde iki tane sayı olacak biri x biri y koordinatını temsim edecek
      // bu fonksiyonun adını da findBorders koyalım
      // içerisine alacağı şey ise bize verdiği harita
      // iki boyutlu array alacağını 14.satırda belirtiyoruz
      
      // yeni bir array list oluşturalım bu list integer arrayleri içersin adını borders koyalım- buna da new array list diyerek oluşturma işlemini tamamlıyoruz 15.satır
      // aşağıda bunu return edelim 59. satırda
      
      // yapmamamız gereken şey, üst alt sol ve sağ incelemek
      // bunun kolay bi yolu yok üsteki her elemanı kontrol etmemiz gerekiyor çünkü 0 mı 1 mi olduğunu bulmamız gerekiyor
      // ilk satırdakiler eğer 1 ise 15.satırda borders dediğimiz listeye o elemanın pozisyonunu x ve y koordinatına eklememiz gerekiyor
      // daha sonra alta sola sağa geçeceğiz
      
      
      
      // bu döngüyle üst ilk satırdaki ilk indexden başlayıp teker teker gidecek bir döngü
      // sadece ilk satırı kontrol ettiğimiz için i denilen bir int tanımlanır ve bunun büyüklüğü ilk satırdaki arrayin büyüklüğünü aşmayacak
      // yani iki boyutlu arrayin ilk satırının uzunluğundan küçük olması gerekiyor ve i her sefende artar
      // if kullanarak kontrol ederiz  yani eğer iki boyutlu arrayin ilk elemanının i'ninci elemanı
      // ki i her seferinde artıyor ve 1e eşitse o zman borders dediğimiz array liste göndermek
      // fakat neyini göndeririz - bunun koordinatlarını içeren iki elemanlı bir arrayi göndericez
      // burda iki elemanlı bir array oluşturup bunu array liste gönderelim
      // bir integer arrayi oluşturup adını border koyuyorum arrayin elemanları 0 ve i yani x ve y koordinatları oluyor 
      
      
        // ilk satırdaki 1'ler
        for(int i = 0; i < array[0].length; i++) {
            if(array[0][i] == 1) {
                int[] border = {0,i};     // bir integer arrayi oluşturup adını border koyuyorum arrayin elemanları 0 ve i yani x ve y koordinatları oluyor
                borders.add(border);      // daha sonra oluşturduğumuz elemanı göndermek. ilk satır bu şekilde yapıldı şimdi son satırdaki 1lere gelirsek
                islands.add(border);
            }
        }
            
          
      // son satır arrayın uzunluğundan bir eksik eleman 
      // bu son satırdaki her elemana erişebilmek için arrayin 5.elemanında bir for döngüsü kurmak gerekli
      // çünkü arraying son elemanı lazım bize, array kaç elemanlı olursa olsun son elemanına her zman bu şekilde erişilir
      
        // son satırdaki 1'ler
        for(int i = 0; i < array[array.length - 1].length; i++) { // int değeri aburdaki arrayin eksi 1in uzunluğundan küçük olmalı
            if(array[array.length-1][i] == 1) { // yine kontrol edilmesi gereken şey 1e eşit mi durumu, 1e eşitse yine aynı şekilde bir border oluşturulur
                int[] border = {array.length-1, i};     // yine aynı şekilde bir border oluşturup yine iki elemandan oluşacak ilk elemanı x koordinatı olacak, ikincisi ise i olacak
                borders.add(border);                    // böylece son satırdaki tüm 1lere erişmiş olduk ve borders.add diyerek içeri göndeririz şimdi geriye sol ve sağ kaldı
                islands.add(border);
            }
        }

        // sol sütundaki 1'ler
        for(int i = 1; i < array.length - 1; i++){
            if(array[i][0] == 1) {
                int[] border = {i,0};
                borders.add(border);
                islands.add(border);
            }
        }

        // sağ sütundaki 1'ler
        for(int i = 1; i < array.length - 1; i++) {
            if(array[i][array.length - 1] == 1) {
                int[] border = {i, array.length - 1};
                borders.add(border);
                islands.add(border);
            }
        }
        return borders;
    }

    public static void findPath(int x, int y, int[][] array, ArrayList<int[]> islands) {
        // yukarıdaki eleman 1 ise
        if(x > 0 && array[x-1][y] == 1) {
            int[] point = { x-1, y };
            if(!arraylistContains(point,islands)) {
                islands.add(point);
                findPath(x-1, y, array, islands);
            }
        }
        // aşağıdaki eleman 1 ise
        if(x < array.length - 1 && array[x+1][y] == 1) {
            int[] point = { x+1, y };
            if(!arraylistContains(point,islands)) {
                islands.add(point);
                findPath(x+1, y, array, islands);
            }
        }
        // soldaki eleman 1 ise
        if(y > 0 && array[x][y-1] == 1) {
            int[] point = { x, y-1 };
            if(!arraylistContains(point,islands)) {
                islands.add(point);
                findPath(x, y-1, array, islands);
            }
        }
        // sağdaki eleman 1 ise
        if(y < array[x].length - 1 && array[x][y+1] == 1) {
            int[] point = { x, y+1 };
            if(!arraylistContains(point,islands)) {
                islands.add(point);
                findPath(x, y+1, array, islands);
            }
        }
    }

    public static int[][] removeIslands(int[][] array) {
        // silinmeyecek bütün 1'lerin koordinatlarını tutacak arraylist
        ArrayList<int[]> islands = new ArrayList<>();
        // sınırlardaki 1'lerin koordinatlarını tutacak arraylist
        ArrayList<int[]> borders = findBorders(array,islands);

        for(int[] border: borders) {
            findPath(border[0], border[1], array, islands);
        }

        int[][] result = new int[array.length][array[0].length];
        for(int[] island: islands) {
            result[island[0]][island[1]] = 1;
        }

        return result;

    } 
      // 1. TEXT bir metod yazarak sınırdaki birlerin koordinatlarını belirleyip saklayalım
      // daha sonra buj koordinatlatlardan yanda yukarda ve aşağıda bulunan 1lere erişmemiz gerekli
      // ilk etapta sınırdaki 1ler ile başlamak gerekiyor
  
 
    public static void main(String[] args) {
        int[][] island = {  // İki elemanlı bir array tanımlandı. İhtiyacımız olan sınırlardaki 1lerin yerini belirlemek
                { 1, 0, 0, 0, 0, 0, 1, 0, 0, 1 }, // 0
                { 0, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, // 1
                { 0, 0, 1, 0, 1, 0, 1, 1, 1, 0 }, // 2
                { 1, 1, 0, 0, 1, 0, 0, 0, 0, 0 }, // 3
                { 1, 0, 1, 1, 0, 0, 1, 1, 1, 0 }, // 4
                { 1, 0, 0, 0, 0, 1, 0, 0, 0, 1 }, // 5
                { 1, 0, 0, 0, 0, 0, 1, 0, 0, 1 }, 
                { 0, 1, 0, 1, 1, 1, 0, 0, 1, 1 },
                { 0, 0, 1, 0, 1, 0, 1, 1, 1, 0 },
                { 1, 1, 0, 0, 1, 0, 0, 0, 0, 0 }
        };

        int[][] result = removeIslands(island);

        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }

    }
}
