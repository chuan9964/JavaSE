package homework.plus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Demo {

    /*
    需求1:
        定义一个读取  product文件的方法
          其中
                       手机     #   p001  #   Iphone15   #4599.0
             表示的是   分类名称  商品id      商品名称     商品价格
          并将读取内容 存储到一个 ArrayList
          集合格式:
              ArrayList<Product>
              其中
                里面是每一个封装好的 product对象

         方法参数 无
         方法返回值  ArrayList<Product>
     */
    public static  ArrayList<Product> parseText() throws Exception{

        ArrayList<Product> list = new ArrayList<>();
        FileReader fileReader = new FileReader("D:\\code\\day12\\src\\products.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line=bufferedReader.readLine())!=null){
            String[] split = line.split("#");
            list.add(new Product(split[1] , split[2] , Double.valueOf(split[3]) , split[0]));
        }
        bufferedReader.close();
        fileReader.close();
        return list;
    }

    /*
    需求2:
        在成员变量位置 定义一个 变量
          public static Map<String,List<Product>>  store = new HashMap<>(); 对象
        需求就是将parseText()的返回集合转换成
           一个 Map<String,ArrayList<Product>> store 集合


        具体要求 要求:
             1. 把 将parseText 方法返回的 List 集合通过方法参数传递进来。
             2. 以分类名称为单位分类商品，并且存储到成员变量 map 集合中。
             3. 在分类商品时，可以先遍历学生，再完成学生的分类。  list.stream.forEach() 或者 list.forEach()遍历
             重点提示   此操作思想和课上map 统计案例很像。 先判断有没有该键有是一种思路 没有是另一种思路。



           提示 下面是没有学习过得  可以试着用一下--很考察能力哦
              stream流里面有个  collect(Collectors.groupingBy((元素) -> 元素分组规则字段))
              collect收集操作   Collectors.groupingBy
                           可以将  单列流数据 按照元素指定属性进行分组
     */
    public static Map<String,List<Product>>  store = new HashMap<>();

    public static void  saveStore(ArrayList<Product> list){
     //先用自己的方法
	 
//        Stream 流的高级用法
//        store= list.stream().collect(Collectors.groupingBy((s) -> s.getCategoryName()));
        ArrayList iphoneList = new ArrayList();
        ArrayList computerList = new ArrayList();
        ArrayList shumaList = new ArrayList();
        list.forEach((product)->{
            if(product.getCategoryName().equals("手机")){
              iphoneList.add(product);
            }else if(product.getCategoryName().equals("电脑")){
                computerList.add(product);
            }else {
                shumaList.add(product);
            }
        });
        store.put("手机",iphoneList);
        store.put("电脑",computerList);
        store.put("数码",shumaList);
    }
   /*
   需求三:
       在main中调用 parseText方法 得到解析后的商品集合对象
       再调用saveStore方法 将商品集合数据 存储到 store 商铺中
       请  设计在main中设计程序 完成如下操作
          1: 使用键盘录入对象 录入 需要的分类名称
          2: 根据分类名称 找到对应商品集合 并展示
          3: 展示要求 集合中的商品 要按照 价格进行升序展示 (提示--可以使用stream流  可以使用Collections.sort())

    */
    public static void main(String[] args)throws Exception {
        //调用 parseText方法 得到解析后的商品集合对象
        ArrayList<Product> products = parseText();
        //  调用saveStore方法 将商品集合数据 存储到 store 商铺中
         saveStore(products);

         //键盘录入
        Scanner sc = new Scanner(System.in);
        //提示
        System.out.println("请录入要查看的分类名称,我帮你找出所有的商品信息:");
        String categoryName = sc.next();
        //从商品列表找出 并排序 遍历
        System.out.println(store.get(categoryName));
    }



}
