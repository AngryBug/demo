package com.test.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.test.models.CopyModel;
import com.test.models.OriginalModel;

@Mapper(componentModel = "spring")
public interface ModelMapper {
	
	public ModelMapper INSTANCE = Mappers.getMapper(ModelMapper.class);
	
	public CopyModel mapOriginal2Copy(OriginalModel original);

}
