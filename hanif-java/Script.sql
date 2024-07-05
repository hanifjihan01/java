alter table dosen
alter column nama_dosen 
set data type varchar(200);

select kode_mhs, nama_mhs, nama_jurusan, deskripsi
from tb_mahasiswa join agama on tb_mahasiswa.id = agama.id 
join jurusan on agama.id = jurusan.id;

select * from jurusan where status_jurusan = 'tidak aktif';

select nilai, status_ujian from nilai join tb_ujian on nilai.id = tb_ujian.id where nilai > 80;

select * from jurusan where nama_jurusan like 'sis%';

select kode_ujian, count(kode_mahasiswa) from nilai group by kode_ujian having count(kode_mahasiswa) > 1;

select kode_mhs, nama_mhs, nama_jurusan, deskripsi, nama_dosen, status_jurusan, kode_type_dosen
from tb_mahasiswa join jurusan on tb_mahasiswa.id = jurusan.id join agama on jurusan.id = agama.id 
join dosen on agama.id = dosen.id;


