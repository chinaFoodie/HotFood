package com.mua.cml.serviceImpl;

import com.mua.cml.mapper.CmlNationMapper;
import com.mua.cml.model.CmlNation;
import com.mua.cml.model.CmlNationExample;
import com.mua.cml.model.Picture;
import com.mua.cml.service.NationService;
import com.mua.cml.util.DateUtil;
import com.mua.cml.util.IpUtil;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Properties;

/**
 * Created by King on 2017/7/17.
 */
@Service
public class NationImpl implements NationService {

    @Autowired
    private CmlNationMapper cmlNationMapper;

    @Override
    public int insert(CmlNation cmlNation) {
        return cmlNationMapper.insert(cmlNation);
    }

    @Override
    public int updNation(String nationName, String nationDesc, String nationPic) {
        CmlNationExample cmlNationExample = new CmlNationExample();
        cmlNationExample.createCriteria().andNationNameEqualTo(nationName);
        List<CmlNation> nations = cmlNationMapper.selectByExample(cmlNationExample);
        if (nations.size() > 0) {
            CmlNation cmlNation = nations.get(0);
            cmlNation.setNationDesc(nationDesc);
            cmlNation.setNationName(nationName);
            cmlNation.setNationPic(nationPic);
            return cmlNationMapper.updateByPrimaryKey(cmlNation);
        } else {
            CmlNation cmlNation = new CmlNation();
            cmlNation.setNationDesc(nationDesc);
            cmlNation.setNationName(nationName);
            cmlNation.setNationPic(nationPic);
            return cmlNationMapper.insert(cmlNation);
        }
    }

    @Override
    public String upload(MultipartFile file, HttpServletRequest request, String picUrl) throws IOException {
        //过滤合法的文件类型
        String fileName = file.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
        String allowSuffixs = "gif,jpg,jpeg,bmp,png,ico";
        if (allowSuffixs.indexOf(suffix) == -1) {
            return "";
        }

        Properties config = new Properties();
        config.load(this.getClass().getClassLoader().getResourceAsStream("config.propertites"));
        String urlPath = "http://" + IpUtil.getInsideIp() + ":8080/image";//image config.getProperty("urlRoot")

        String localPath = request.getSession().getServletContext().getRealPath("/");
        if (localPath.indexOf("\\ROOT") > 0) {
            localPath = localPath.substring(0, localPath.indexOf("\\ROOT")) + "\\image";
        }
        //创建新目录
        String uri = File.separator + DateUtil.getNowDateStr(File.separator);
        File dir = new File(localPath + uri);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        //创建新文件
        String newFileName = DateUtil.getUniqueFileName();
        File f = new File(dir.getPath() + File.separator + newFileName + "." + suffix);
        //将输入流中的数据复制到新文件
        FileUtils.copyInputStreamToFile(file.getInputStream(), f);

        Picture pic = new Picture();
        pic.setLocalPath(f.getAbsolutePath());
        pic.setName(f.getName());
        pic.setUrl(urlPath + uri.replace("\\", "/") + "/" + newFileName + "." + suffix);
        pic.setAddTime(new Date());

        return pic.getUrl();
    }
}
