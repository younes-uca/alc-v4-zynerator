package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.Services;
import ma.zsmart.engflexy.bean.history.ServicesHistory;
import ma.zsmart.engflexy.dao.criteria.core.ServicesCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ServicesHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.ServicesAdminService;
import ma.zsmart.engflexy.ws.converter.ServicesConverter;
import ma.zsmart.engflexy.ws.dto.ServicesDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.zsmart.engflexy.zynerator.process.Result;


import org.springframework.web.multipart.MultipartFile;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;

@Api("Manages services services")
@RestController
@RequestMapping("/api/admin/services/")
public class ServicesRestAdmin  extends AbstractController<Services, ServicesDto, ServicesHistory, ServicesCriteria, ServicesHistoryCriteria, ServicesAdminService, ServicesConverter> {


    @ApiOperation("upload one services")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple servicess")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all servicess")
    @GetMapping("")
    public ResponseEntity<List<ServicesDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all servicess")
    @GetMapping("optimized")
    public ResponseEntity<List<ServicesDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a services by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ServicesDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  services")
    @PostMapping("")
    public ResponseEntity<ServicesDto> save(@RequestBody ServicesDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  services")
    @PutMapping("")
    public ResponseEntity<ServicesDto> update(@RequestBody ServicesDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of services")
    @PostMapping("multiple")
    public ResponseEntity<List<ServicesDto>> delete(@RequestBody List<ServicesDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified services")
    @DeleteMapping("")
    public ResponseEntity<ServicesDto> delete(@RequestBody ServicesDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified services")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple servicess by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds servicess by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ServicesDto>> findByCriteria(@RequestBody ServicesCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated servicess by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ServicesCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports servicess by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ServicesCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets services data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ServicesCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets services history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets services paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ServicesHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports services history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ServicesHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets services history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ServicesHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    @ApiOperation("Gets services next ordre value")
    @GetMapping(value = "/getNextOrdre")
    public ResponseEntity<Long> getNextOrdre() {
        Long nextOrdre = service.getNextOrdre();
        return new ResponseEntity<>(nextOrdre, HttpStatus.OK);
    }
    public ServicesRestAdmin (ServicesAdminService service, ServicesConverter converter) {
        super(service, converter);
    }


}