package cfm.controller;
import cfm.entity.ServerDataObject;;
import cfm.service.CFMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ServerObjectController {
    @Autowired
    private CFMService cfmService;

    @RequestMapping(value = "/getAllServerObjects", method = RequestMethod.GET)
    public String getServerObjects(Model model) {
        final FilterModel filterModel = new FilterModel();

        if(!model.containsAttribute("serverObjects")) {
            final List<ServerDataObject> serverDataObjects = cfmService.getAllServerDataObject("");
            model.addAttribute("serverObjects", serverDataObjects);
        }
        model.addAttribute("filterModel", filterModel);

        return "server_data";
    }

    @RequestMapping(value = "/filterAndRedirect", method = RequestMethod.POST)
    public String filterAndRedirect(final FilterModel filterModel, final RedirectAttributes redirectAttributes) {
        final List<ServerDataObject> serverDataObjects = cfmService.getAllServerDataObject(filterModel.getFilterWord());

        redirectAttributes.addFlashAttribute("serverObjects", serverDataObjects);

        return "redirect:/getAllServerObjects";
    }
}
