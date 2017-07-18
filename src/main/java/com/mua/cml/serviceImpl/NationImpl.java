package com.mua.cml.serviceImpl;

import com.mua.cml.mapper.CmlNationMapper;
import com.mua.cml.model.CmlNation;
import com.mua.cml.model.CmlNationExample;
import com.mua.cml.service.NationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
