package com.elmouttaki.elmehdi.person.utils;

import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;

import java.util.List;

@MapperConfig
public interface GenericMapper <S, T> {

    T sourceToTarget(S source) throws Exception, IllegalAccessException;

    S targetToSource(T target);

    List<T> sourceListToTargetList(List<S> sources) throws Exception;

    List<S> targetListToSourceList(List<T> targets);
}
