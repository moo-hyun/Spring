$(function(){
	
	//User3
	$('#btnUser3s').click(function(){
		
		$.ajax({
			url: '/Ch10/user3',
			type: 'GET',
			dataType: 'json',
			success: function(data){
				console.log(data);
			}
		});
		
	});
	
	$('#btnUser3').click(function(){
		
		$.ajax({
			url: '/Ch10/user3/A104',
			type: 'GET',
			dataType: 'json',
			success: function(data){
				console.log(data);
			}
		});
		
		
		
	});
	
	$('#btnUser3Register').click(function(){
		
		const jsonData= {
			id: 'A104',
			name: '홍길동',
			hp: '010-1234-4444',
			age: 22
		};
		
		$.ajax({
			url: '/Ch10/user3',
			type: 'POST',
			data: jsonData,
			dataType: 'json',
			success: function(data){
				console.log(data);
			}
		});
		
	});
	
	$('#btnUser3Modify').click(function(){
		
		const jsonData= {
			id: 'A104',
			name: '홍길동',
			hp: '010-1234-5555',
			age: 30
		};
		
		$.ajax({
			url: '/Ch10/user3',
			type: 'PUT',
			data: jsonData,
			dataType: 'json',
			success: function(data){
				console.log(data);
			}
		});
		
	});
	
	$('#btnUser3Delete').click(function(){
		
		$.ajax({
			url: '/Ch10/user3/A104',
			type: 'DELETE',
			dataType: 'json',
			success: function(data){
				console.log(data);
			}
		});
		
	});
	
});
			