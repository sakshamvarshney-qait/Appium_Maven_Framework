package com.qainfotech.pageUtilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

/**
 *
 * @author Saksham Varshney
 */
public class YamlFileReader
{
    public static String yamlFilePath = "src\\test\\resources\\testData\\config.yaml";

    public static String getYamlData(String token) throws FileNotFoundException
    {
        Reader file = new FileReader(yamlFilePath);
        Yaml yaml = new Yaml();
        Map<String, Object> object = (Map<String, Object>) yaml.load(file);
        return getMapValue(object, token);
    }

    public static String getMapValue(Map<String, Object> object, String token)
    {
        String[] st = token.split("\\.");
        return parseMap(object, token).get(st[st.length - 1]).toString();
    }

    public static Map<String, Object> parseMap(Map<String, Object> object, String token)
    {
        if (token.contains(".")) {
            String[] st = token.split("\\.");
            object = parseMap((Map<String, Object>) object.get(st[0]), token.replace(st[0] + ".", ""));
        }
        return object;
    }
}