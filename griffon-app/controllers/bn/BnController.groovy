package bn

import java.awt.event.ActionEvent

class BnController {
    // these will be injected by Griffon
    def model
    def view

    def bnDownloaderService

    GroovyShell shell = new GroovyShell()

    // void mvcGroupInit(Map args) {
    //    // this method is called after model and view are injected
    // }

    // void mvcGroupDestroy() {
    //    // this method is called when the group is destroyed
    // }

    /*
    def action = { evt = null ->
    }
    */

    def executeScript(ActionEvent evt = null) {
        model.enabled = false
        doOutside {
//            def result
//            try {
//                result = shell.evaluate(model.scriptSource)
//            } finally {
//                edt {
//                    model.enabled = true
//                    model.scriptResult = result
//                }
//            }
            bnDownloaderService.loadData()
        }
    }
}
