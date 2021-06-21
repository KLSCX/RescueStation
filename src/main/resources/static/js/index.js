function change(data){
    let url = "";
    switch (data) {
        case 'lyxz':
            url = "/toAdoptionNotice";
            console.log("曾经跳转到1")
            break;

        case 'xyq':
            url = "/toWishingWall";
            console.log("曾经跳转到2")
            break;

        case 'cwbk':
            url = "/toPetEncyclopedia";
            console.log("曾经跳转到3")
            break;

    }
    $("iframe").attr('src',url);
}