package com.renzku;

import com.renzku.dxfConvert.DXFData;
import com.renzku.dxfConvert.GraphicConverter;
import com.renzku.dxfConvert.Parser;
import com.renzku.dxfConvert.sql.Graphic;
import org.apache.commons.lang3.StringUtils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tuzhiming on 2018/7/2.
 */
public class ConvertTest {
    public static void main(String[] args){

        String file = "D:\\testFile\\cadfile\\多段线及凸度圆.dxf";
        Parser parser =new Parser();
        GraphicConverter converter = new GraphicConverter();
        DXFData data = null;
        List<Graphic> list = null;
        try{
            data = parser.dxfParse(new FileInputStream(file));
            list = converter.converter(data);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(data);
        System.out.println("list:" + list.size());
    }
}
