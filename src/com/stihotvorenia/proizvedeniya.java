package com.stihotvorenia;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class proizvedeniya extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Bundle extras = getIntent().getExtras();
		
		if(extras.getInt("id") == 1)  {
		setContentView(R.layout.botev);}
		else if (extras.getInt("id") == 2){
			setContentView(R.layout.vazov);}
		else if (extras.getInt("id") == 3){
			setContentView(R.layout.vapcarov);}
		else if (extras.getInt("id") == 4){
			setContentView(R.layout.debelyanov);}
		else if (extras.getInt("id") == 5){
			setContentView(R.layout.smirnenski);}
		else if (extras.getInt("id") == 6){
			setContentView(R.layout.yavorov);}
		else if (extras.getInt("id") == 7){
			setContentView(R.layout.slaveykov);}
		else 
			setContentView(R.layout.milev);
}
	
	@Override
	public void onClick(View v) {
		Intent secondScreen1 = new Intent(getApplicationContext(), screen.class);
		switch(v.getId()) {		
		  case R.id.botev1:
			  
	        	secondScreen1.putExtra("id", "maitse_si");
	        	 startActivity(secondScreen1);    
	        	break;
	        case R.id.botev2:
	        	secondScreen1.putExtra("id", "na_proshtavane");
	        	 startActivity(secondScreen1);      
	        	break;
	        case R.id.botev3:
	        	secondScreen1.putExtra("id", "kam_brata_si");
	        	 startActivity(secondScreen1);
	        	break;     	
	        case R.id.botev4:
	        	secondScreen1.putExtra("id", "elegia");
	        	 startActivity(secondScreen1);
	        	break;
	        case R.id.botev5:
	        	secondScreen1.putExtra("id", "delba");
	        	 startActivity(secondScreen1);
	        	break;
	        case R.id.botev6:
	        	secondScreen1.putExtra("id", "do_moeto_parvo_libe");
	        	 startActivity(secondScreen1);
	        	break;
	        case R.id.botev7:
	        	secondScreen1.putExtra("id", "hayduti");
	        	 startActivity(secondScreen1);
	        	break;
	        case R.id.botev8:
	        	secondScreen1.putExtra("id", "borba");
	        	 startActivity(secondScreen1);
	        	break;
	        case R.id.botev9:
	        	secondScreen1.putExtra("id", "hadzhi_dimitar");
	        	 startActivity(secondScreen1);
	        	break;
	        case R.id.botev10:
	        	secondScreen1.putExtra("id", "moyata_molitva");
	        	 startActivity(secondScreen1);
	        	break;
	        case R.id.botev11:
	        	secondScreen1.putExtra("id", "obesvaneto_na_levski");
	        	 startActivity(secondScreen1);
	        	break;
	        case R.id.botev12:
	        	secondScreen1.putExtra("id", "v_mehanata");
	        	 startActivity(secondScreen1);       	
	        	break;
	        case R.id.vazov1:
	        	secondScreen1.putExtra("id", "radetski");
	        	startActivity(secondScreen1);
	        	break;
	        case R.id.vazov15:
	        	secondScreen1.putExtra("id", "de_e_bg");
	        	startActivity(secondScreen1);
	        	break;
	        case R.id.vazov2:
	        	secondScreen1.putExtra("id", "levski");
	        	startActivity(secondScreen1);
	        	break;
	        case R.id.vazov3:
	        	secondScreen1.putExtra("id", "kocho");
	        	startActivity(secondScreen1);
	        	break;
	        case R.id.vazov4:
	        	secondScreen1.putExtra("id", "paisii");
	        	startActivity(secondScreen1);
	        	break;
	        case R.id.vazov5:
	        	secondScreen1.putExtra("id", "opalchentsite");
	        	startActivity(secondScreen1);
	        	break;
	        case R.id.vazov6:
	        	secondScreen1.putExtra("id", "otechestvo");
	        	startActivity(secondScreen1);
	        	break;
	        case R.id.vazov7:
	        	secondScreen1.putExtra("id", "batak");
	        	startActivity(secondScreen1);
	        	break;
	        case R.id.vazov8:
	        	secondScreen1.putExtra("id", "slivnitsa");
	        	startActivity(secondScreen1);
	        	break;
	        case R.id.vazov9:
	        	secondScreen1.putExtra("id", "rila");
	        	startActivity(secondScreen1);
	        	break;
	        case R.id.vazov10:
	        	secondScreen1.putExtra("id", "moite_pesni");
	        	startActivity(secondScreen1);
	        	break;
	        case R.id.vazov11:
	        	secondScreen1.putExtra("id", "elate_ni_vizhte");
	        	startActivity(secondScreen1);
	        	break;
	        case R.id.vazov12:
	        	secondScreen1.putExtra("id", "belogradchik");
	        	startActivity(secondScreen1);
	        	break;
	        case R.id.vazov13:
	        	secondScreen1.putExtra("id", "az_sam_balgarche");
	        	startActivity(secondScreen1);
	        	break;
	        case R.id.vazov14:
	        	secondScreen1.putExtra("id", "balgarskiyat_ezik");
	        	startActivity(secondScreen1);
	        	break;
	        case R.id.vapcarov1:
	        	secondScreen1.putExtra("id", "shte_stroim_zavod");
	        	startActivity(secondScreen1);
	        break;
	        case R.id.vapcarov2:
	        	secondScreen1.putExtra("id", "zavod");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.vapcarov3:
	        	secondScreen1.putExtra("id", "pesen_za_choveka");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.vapcarov4:
	        	secondScreen1.putExtra("id", "pismo");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.vapcarov5:
	        	secondScreen1.putExtra("id", "vyara");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.vapcarov6:
	        	secondScreen1.putExtra("id", "proshtalno");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.vapcarov7:
	        	secondScreen1.putExtra("id", "san");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.vapcarov8:
	        	secondScreen1.putExtra("id", "istoriya");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.vapcarov9:
	        	secondScreen1.putExtra("id", "kino");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.debelyanov1:
	        	secondScreen1.putExtra("id", "da_se_zavarnesh");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.debelyanov2:
	        	secondScreen1.putExtra("id", "tiha_pobeda");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.debelyanov3:
	        	secondScreen1.putExtra("id", "plovdiv");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.debelyanov4:
	        	secondScreen1.putExtra("id", "spi_gradat");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.debelyanov5:
	        	secondScreen1.putExtra("id", "cherna_pesen");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.debelyanov6:
	        	secondScreen1.putExtra("id", "mig");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.debelyanov7:
	        	secondScreen1.putExtra("id", "pomnish_li");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.debelyanov8:
	        	secondScreen1.putExtra("id", "edin_ubit");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.debelyanov9:
	        	secondScreen1.putExtra("id", "sirotna_pesen");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.debelyanov10:
	        	secondScreen1.putExtra("id", "az_iskam_da_te_pomnya");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.smirnenski1:
	        	secondScreen1.putExtra("id", "da_bade_den");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.smirnenski2:
	        	secondScreen1.putExtra("id", "zimni_vecheri");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.smirnenski3:
	        	secondScreen1.putExtra("id", "stariyat_muzikant");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.smirnenski4:
	        	secondScreen1.putExtra("id", "niy");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.smirnenski5:
	        	secondScreen1.putExtra("id", "yohan");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.smirnenski6:
	        	secondScreen1.putExtra("id", "yunosha");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.smirnenski7:
	        	secondScreen1.putExtra("id", "tsvetarka");
	        	startActivity(secondScreen1);
	        break;
	        case R.id.smirnenski8:
	        	secondScreen1.putExtra("id", "prez_burqta");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.smirnenski9:
	        	secondScreen1.putExtra("id", "kam_visini");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.smirnenski10:
	        	secondScreen1.putExtra("id", "bratchetata");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.smirnenski11:
	        	secondScreen1.putExtra("id", "ulitsata");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.smirnenski12:
	        	secondScreen1.putExtra("id", "bezimennite_dushi");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.smirnenski13:
	        	secondScreen1.putExtra("id", "esenni_lista");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.smirnenski14:
	        	secondScreen1.putExtra("id", "lubov_pod_lunata");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.yavorov1:
	        	secondScreen1.putExtra("id", "prosti");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.yavorov2:
	        	secondScreen1.putExtra("id", "shte_badesh");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.yavorov3:
	        	secondScreen1.putExtra("id", "pesenta_na_choveka");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.yavorov4:
	        	secondScreen1.putExtra("id", "zatochenitsi");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.yavorov5:
	        	secondScreen1.putExtra("id", "pesen_na_pesenta_mi");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.yavorov6:
	        	secondScreen1.putExtra("id", "maska");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.yavorov7:
	        	secondScreen1.putExtra("id", "gradushka");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.yavorov8:
	        	secondScreen1.putExtra("id", "dve_hubavi_ochi");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.yavorov9:
	        	secondScreen1.putExtra("id", "ston");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.yavorov10:
	        	secondScreen1.putExtra("id", "senki");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.slaveykov1:
	        	secondScreen1.putExtra("id", "spi_ezeroto");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.slaveykov2:
	        	secondScreen1.putExtra("id", "cis_moll");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.slaveykov3:
	        	secondScreen1.putExtra("id", "ni_lah");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.slaveykov4:
	        	secondScreen1.putExtra("id", "samoten_grob");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.slaveykov5:
	        	secondScreen1.putExtra("id", "ralitsa");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.slaveykov6:
	        	secondScreen1.putExtra("id", "lud_gidia");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.slaveykov7:
	        	secondScreen1.putExtra("id", "plakala_e_gorchivo");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.slaveykov8:
	        	secondScreen1.putExtra("id", "vo_staichkata");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.slaveykov9:
	        	secondScreen1.putExtra("id", "morna_lyatna");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.slaveykov10:
	        	secondScreen1.putExtra("id", "psalom_na_poeta");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.slaveykov11:
	        	secondScreen1.putExtra("id", "molitva");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.slaveykov12:
	        	secondScreen1.putExtra("id", "po_jatva");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.slaveykov13:
	        	secondScreen1.putExtra("id", "tsar_samuil");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.slaveykov14:
	        	secondScreen1.putExtra("id", "nad_bezkrainite");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.milev1:
	        	secondScreen1.putExtra("id", "septemvri");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.milev2:
	        	secondScreen1.putExtra("id", "i_v_tozi_chas");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.milev3:
	        	secondScreen1.putExtra("id", "o_dajd");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.milev4:
	        	secondScreen1.putExtra("id", "chas_na_vecherni");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.milev5:
	        	secondScreen1.putExtra("id", "sred_tezi_sivi");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.milev6:
	        	secondScreen1.putExtra("id", "kaji_vnezapno");
	        	startActivity(secondScreen1);
        	break;
	        case R.id.milev7:
	        	secondScreen1.putExtra("id", "martveshki_zelena");
	        	startActivity(secondScreen1);
        	break;
        	
		 case R.id.button_1:
	        	finish();
	        	break;
		
		}
		
	}
}
