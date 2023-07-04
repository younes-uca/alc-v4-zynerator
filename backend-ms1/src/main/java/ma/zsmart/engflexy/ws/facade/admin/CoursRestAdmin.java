package ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.Cours;
import ma.zsmart.engflexy.bean.history.CoursHistory;
import ma.zsmart.engflexy.dao.criteria.core.CoursCriteria;
import ma.zsmart.engflexy.dao.criteria.history.CoursHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.CoursAdminService;
import ma.zsmart.engflexy.ws.converter.CoursConverter;
import ma.zsmart.engflexy.ws.dto.CoursDto;
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

@Api("Manages cours services")
@RestController
@RequestMapping("/api/admin/cours/")
public class CoursRestAdmin extends AbstractController<Cours, CoursDto, CoursHistory, CoursCriteria, CoursHistoryCriteria, CoursAdminService, CoursConverter> {


    @ApiOperation("upload one cours")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @ApiOperation("upload multiple courss")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all courss")
    @GetMapping("")
    public ResponseEntity<List<CoursDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all courss")
    @GetMapping("optimized")
    public ResponseEntity<List<CoursDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a cours by id")
    @GetMapping("id/{id}")
    public ResponseEntity<CoursDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

    @ApiOperation("Saves the specified  cours")
    @PostMapping("")
    public ResponseEntity<CoursDto> save(@RequestBody CoursDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  cours")
    @PutMapping("")
    public ResponseEntity<CoursDto> update(@RequestBody CoursDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of cours")
    @DeleteMapping("multiple")
    public ResponseEntity<List<CoursDto>> delete(@RequestBody List<CoursDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }

    @ApiOperation("Delete the specified cours")
    @DeleteMapping("")
    public ResponseEntity<CoursDto> delete(@RequestBody CoursDto dto) throws Exception {
        return super.delete(dto);
    }

    @ApiOperation("Delete the specified cours")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }

    @ApiOperation("Delete multiple courss by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
        return super.deleteByIdIn(ids);
    }


    @ApiOperation("find by etatCours id")
    @GetMapping("etatCours/id/{id}")
    public ResponseEntity<List<CoursDto>> findByEtatCoursId(@PathVariable Long id) {
        return super.findListByChildId(service::findByEtatCoursId, id);
    }

    @ApiOperation("delete by etatCours id")
    @DeleteMapping("etatCours/id/{id}")
    public int deleteByEtatCoursId(@PathVariable Long id) {
        return service.deleteByEtatCoursId(id);
    }

    @ApiOperation("find by parcours id")
    @GetMapping("parcours/id/{id}")
    public ResponseEntity<List<CoursDto>> findByParcoursId(@PathVariable Long id) {
        return super.findListByChildId(service::findByParcoursId, id);
    }

    @ApiOperation("delete by parcours id")
    @DeleteMapping("parcours/id/{id}")
    public int deleteByParcoursId(@PathVariable Long id) {
        return service.deleteByParcoursId(id);
    }

    @ApiOperation("Finds a cours and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<CoursDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds courss by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<CoursDto>> findByCriteria(@RequestBody CoursCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated courss by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody CoursCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports courss by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody CoursCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets cours data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody CoursCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets cours history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets cours paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody CoursHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports cours history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody CoursHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets cours history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody CoursHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public CoursRestAdmin(CoursAdminService service, CoursConverter converter) {
        super(service, converter);
    }
}