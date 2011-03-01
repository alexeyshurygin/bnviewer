application {
    title = 'Bn'
    startupGroups = ['bn']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "bn"
    'bn' {
        model = 'bn.BnModel'
        controller = 'bn.BnController'
        view = 'bn.BnView'
    }

}
