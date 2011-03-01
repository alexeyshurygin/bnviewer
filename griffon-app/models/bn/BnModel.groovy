package bn

import groovy.beans.Bindable

class BnModel {
   // @Bindable String propName
    String scriptSource
    @Bindable def scriptResult
    @Bindable boolean enabled = true
}