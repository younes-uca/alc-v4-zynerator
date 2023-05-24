package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.Admin;
import ma.zsmart.engflexy.bean.history.AdminHistory;
import ma.zsmart.engflexy.dao.criteria.core.AdminCriteria;
import ma.zsmart.engflexy.dao.criteria.history.AdminHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.AdminAdminService;
import ma.zsmart.engflexy.ws.converter.AdminConverter;
import ma.zsmart.engflexy.ws.dto.AdminDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.zsmart.engflexy.zynerator.process.Result;


import org.springframework.web.multipart.MultipartFile;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;

@Api("Manages admin services")
@RestController
@RequestMapping("/api/admin/admin/")
public class AdminRestAdmin  extends AbstractController<Admin, AdminDto, AdminHistory, AdminCriteria, AdminHistoryCriteria, AdminAdminService, AdminConverter> {


    @ApiOperation("upload one admin")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple admins")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all admins")
    @GetMapping("")
    public ResponseEntity<List<AdminDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a admin by id")
    @GetMapping("id/{id}")
    public ResponseEntity<AdminDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  admin")
    @PostMapping("")
    public ResponseEntity<AdminDto> save(@RequestBody AdminDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  admin")
    @PutMapping("")
    public ResponseEntity<AdminDto> update(@RequestBody AdminDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of admin")
    @PostMapping("multiple")
    public ResponseEntity<List<AdminDto>> delete(@RequestBody List<AdminDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified admin")
    @DeleteMapping("")
    public ResponseEntity<AdminDto> delete(@RequestBody AdminDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified admin")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple admins by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds admins by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<AdminDto>> findByCriteria(@RequestBody AdminCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated admins by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody AdminCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports admins by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody AdminCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets admin data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody AdminCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets admin history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets admin paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody AdminHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports admin history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody AdminHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets admin history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody AdminHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public AdminRestAdmin (AdminAdminService service, AdminConverter converter) {
        super(service, converter);
    }


}