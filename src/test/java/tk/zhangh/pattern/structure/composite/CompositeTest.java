package tk.zhangh.pattern.structure.composite;

import org.junit.Test;
import tk.zhangh.pattern.structure.composite.*;

/**
 * Created by ZhangHao on 2016/7/4.
 */
public class CompositeTest {
    /**
     *                  root
     *   1.txt    1.jpg                 folder
     *                      [2.text]    2.jpg    2.rmvb
     */
    @Test
    public void testComposite() {

        Folder root = new Folder("root");

        TextFile textFile1= new TextFile("1.txt");
        ImageFile imageFile1 = new ImageFile("1.jpg");
        Folder childFolder = new Folder("folder");

        root.add(textFile1);
        root.add(imageFile1);
        root.add(childFolder);

        TextFile textFile2 = new TextFile("2.txt");
        ImageFile imageFile2 = new ImageFile("2.jpg");
        VideoFile videoFile2 = new VideoFile("2.rmvb");

        childFolder.add(textFile2);
        childFolder.add(imageFile2);
        childFolder.add(videoFile2);
        childFolder.remove(textFile2);
        print(root);
    }

    public void print(FileComponent file) {
        file.display();
        if (file.getChildren() == null) {
            return;
        }
        for (int i = 0; i < file.getChildren().size(); i++) {
            print(file.getChildren().get(i));
        }
    }
}