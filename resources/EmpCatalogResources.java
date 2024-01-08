package resources;

import mc.sample.empcatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;


@RestController
@RequestMapping("/catalog")
public class EmpCatalogResources {
    @RequestMapping("/{userId}")

    public List<CatalogItem> getCatalog(@PathVariable("userId") int userId){


        return Collections.singletonList(
                new CatalogItem(  "JIL",  "xtern",  1)

        );

    }
}
