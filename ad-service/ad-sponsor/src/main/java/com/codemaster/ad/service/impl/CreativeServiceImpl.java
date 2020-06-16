package com.codemaster.ad.service.impl;

import com.codemaster.ad.dao.CreativeRepository;
import com.codemaster.ad.entity.Creative;
import com.codemaster.ad.service.ICreativeService;
import com.codemaster.ad.vo.CreativeRequest;
import com.codemaster.ad.vo.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreativeServiceImpl implements ICreativeService {

    private final CreativeRepository creativeRepository;

    @Autowired
    public CreativeServiceImpl(CreativeRepository creativeRepository) {
        this.creativeRepository = creativeRepository;
    }

    @Override
    public CreativeResponse createCreative(CreativeRequest request) {

        Creative creative = creativeRepository.save(
                request.convertToEntity()
        );

        return new CreativeResponse(creative.getId(), creative.getName());
    }
}
