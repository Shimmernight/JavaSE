package javaSE.zxl.doc;

//JavaDoc
// 是一种将注释生成HTML文档的技术，
// 生成的HTML文档类似于Java的API，易读且清晰明了。

   /**
    *  @author javaSE.zxl
    * @version 1.0
    */
public class JavaDoc文档 {
    String name = "a";//实例变量

    /**
     * @author javaSE.zxl
     * @since 1.8
     * @throws Exception 无异常抛出
     * @return 返回name姓名
     */
    public  String JavaDoc文档() throws Exception{
        return name;
    }

    //命令行：javadoc -encoding UTF-8 -charset UTF-8
    //IDEA:选中需要生成doc的文件，点击Tools，选择Generate JavaDoc
}
