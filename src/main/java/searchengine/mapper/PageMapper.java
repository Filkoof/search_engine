package searchengine.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import searchengine.dto.PageDto;
import searchengine.entity.PageEntity;
import searchengine.entity.SiteEntity;

@Mapper
public interface PageMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "siteId", source = "site.id")
    @Mapping(target = "path", source = "path")
    @Mapping(target = "code", source = "code")
    @Mapping(target = "content", source = "content")
    PageDto pageEntityToDto(PageEntity page);

    @Mapping(target = "id", source = "page.id")
    @Mapping(target = "site", source = "site")
    @Mapping(target = "path", source = "page.path")
    @Mapping(target = "code", source = "page.code")
    @Mapping(target = "content", source = "page.content")
    PageEntity pageDtoToEntity(PageDto page, SiteEntity site);
}
